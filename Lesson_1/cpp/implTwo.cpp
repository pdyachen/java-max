#include <cmath>
#include "com_orcchg_javacourse_NativeTwo.h"

JNIEXPORT jfloat JNICALL Java_com_orcchg_javacourse_NativeTwo_distance
  (JNIEnv *, jobject, jfloat ax, jfloat ay, jfloat bx, jfloat by) {
  return sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
}

