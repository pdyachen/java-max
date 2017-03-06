/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_pavel_dbtojava_DbApiMaster */

#ifndef _Included_com_pavel_dbtojava_DbApiMaster
#define _Included_com_pavel_dbtojava_DbApiMaster
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_pavel_dbtojava_DbApiMaster
 * Method:    getTotalRowsNumber
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_com_pavel_dbtojava_DbApiMaster_getTotalRowsNumber
  (JNIEnv *, jobject);

/*
 * Class:     com_pavel_dbtojava_DbApiMaster
 * Method:    getTotalRowsNumberLike
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_com_pavel_dbtojava_DbApiMaster_getTotalRowsNumberLike
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_pavel_dbtojava_DbApiMaster
 * Method:    getAllSmallModels
 * Signature: (Lcom/pavel/dbtojava/ShortModel;)Ljava/util/ArrayList;
 */
JNIEXPORT jobject JNICALL Java_com_pavel_dbtojava_DbApiMaster_getAllSmallModels
  (JNIEnv *, jobject, jobject);

/*
 * Class:     com_pavel_dbtojava_DbApiMaster
 * Method:    getGenresJni
 * Signature: (I)[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_com_pavel_dbtojava_DbApiMaster_getGenresJni
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_pavel_dbtojava_DbApiMaster
 * Method:    getModelName
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_pavel_dbtojava_DbApiMaster_getModelName
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_pavel_dbtojava_DbApiMaster
 * Method:    getModelBigPicture
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_pavel_dbtojava_DbApiMaster_getModelBigPicture
  (JNIEnv *, jclass, jint);

/*
 * Class:     com_pavel_dbtojava_DbApiMaster
 * Method:    getModelSmallPicture
 * Signature: (I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_pavel_dbtojava_DbApiMaster_getModelSmallPicture
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif
#endif
