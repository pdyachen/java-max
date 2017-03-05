#include "models_db.h"
#include "com_pavel_dbtojava_DbApiMaster.h"
#include <iostream>

db::ModelsDatabase model_db;

JNIEXPORT jint JNICALL Java_com_pavel_dbtojava_DbApiMaster_getTotalRowsNumber
  (JNIEnv *, jobject) {  	
    //std::cout << "Simple getTotalRows call " << "\n";
  	return model_db.getTotalModels();
  }

JNIEXPORT jint JNICALL Java_com_pavel_dbtojava_DbApiMaster_getTotalRowsNumberLike
  (JNIEnv * jenv, jobject, jstring input_str) {

  	const char* char_arr = jenv->GetStringUTFChars(input_str, 0);
  	std::string str(char_arr);
    //std::cout << "Message " << str << "\n";
  	std::vector<std::string> v;  	
  	v.push_back(str);
  	jenv->ReleaseStringUTFChars(input_str, char_arr);  	
  	int count_result =  model_db.getTotalModels(v);  	
  	return count_result;
  }

  JNIEXPORT jstring JNICALL Java_com_pavel_dbtojava_ShortModel_getModelName
  (JNIEnv * jenv, jobject, jint model_id) {
    std::string cstring_result = model_db.getSmallModel(model_id).getName();
    jstring result = jenv->NewStringUTF((char*)cstring_result.c_str());    
    return result;
  }

  JNIEXPORT jstring JNICALL Java_com_pavel_dbtojava_ShortModel_getModelSmallpicture
  (JNIEnv * jenv, jobject, jint model_id)  {
    std::string cstring_result = model_db.getSmallModel(model_id).getCoverSmall();
    jstring result = jenv->NewStringUTF((char*)cstring_result.c_str());    
    return result;
  }

  JNIEXPORT jobject JNICALL Java_com_pavel_dbtojava_DbApiMaster_getAllSmallModels
  (JNIEnv * jenv, jobject self, jobject smodel) {

    std::vector<SmallModel>* vect = new std::vector<SmallModel>();       
    jclass clazz_list = jenv->FindClass("java/util/ArrayList");      
    jobject list_object = jenv->NewObject(clazz_list, jenv->GetMethodID(clazz_list, "<init>", "()V"));    
    jmethodID add_method_id = jenv->GetMethodID(clazz_list, "add", "(Ljava/lang/Object;)Z"); 
    jclass clazz_mod_obj = jenv->GetObjectClass(smodel);
    jmethodID smodel_init_id = jenv->GetMethodID(clazz_mod_obj, "<init>", "(I)V");

    model_db.getSmallModels(vect);
    for (int i = 0; i < vect->size(); ++i)
    {
      smodel = jenv->NewObject(clazz_mod_obj, smodel_init_id, vect->at(i).getId());
      jenv->CallVoidMethod(list_object, add_method_id, smodel);
      
    }
    delete vect;
    return list_object;
  }