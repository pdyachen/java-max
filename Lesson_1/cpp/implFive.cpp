#include "com_orcchg_javacourse_NativeFive.h"

JNIEXPORT void JNICALL Java_com_orcchg_javacourse_NativeFive_call
  (JNIEnv *jenv, jobject, jobject obj) {

  jclass clazz = jenv->FindClass("com/orcchg/javacourse/CallNativeFive");

  jmethodID method_id = jenv->GetMethodID(clazz, "test", "(Ljava/lang/String;)V");

  jstring message = jenv->NewStringUTF("Hello, World!");
  jenv->CallObjectMethod(obj, method_id, message);
}

