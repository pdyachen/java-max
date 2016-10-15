#include <cmath>
#include "com_orcchg_javacourse_NativeFour.h"

JNIEXPORT jfloat JNICALL Java_com_orcchg_javacourse_NativeFour_distance
  (JNIEnv *jenv, jobject, jobject A, jobject B) {

  jclass clazzA = jenv->GetObjectClass(A);
  jclass clazz  = jenv->FindClass("com/orcchg/javacourse/Point");

  jfieldID x_field_id = jenv->GetFieldID(clazz, "x", "F");
  jfieldID y_field_id = jenv->GetFieldID(clazz, "y", "F");

  jfloat ax = jenv->GetFloatField(A, x_field_id);
  jfloat ay = jenv->GetFloatField(A, y_field_id);
  jfloat bx = jenv->GetFloatField(B, x_field_id);
  jfloat by = jenv->GetFloatField(B, y_field_id);

  return sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
}

