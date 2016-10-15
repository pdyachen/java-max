#include <cstring>
#include "com_orcchg_javacourse_NativeThree.h"

void reverse(const char* src, char* dest);

JNIEXPORT jstring JNICALL Java_com_orcchg_javacourse_NativeThree_reverseString
  (JNIEnv *jenv, jobject, jstring input) {

  const char* raw_string = jenv->GetStringUTFChars(input, nullptr);

  char* inversed = new char[strlen(raw_string)];
  reverse(raw_string, inversed);

  jenv->ReleaseStringUTFChars(input, raw_string);

  jstring result = jenv->NewStringUTF(inversed);
  delete [] inversed;

  return result;
}

// ----------------------------------------------------------------------------
void reverse(const char* src, char* dest) {
  int length = strlen(src);
  strncpy(dest, src, length);
  for (int i = 0; i < length / 2; ++i) {
    char temp = dest[i];
    dest[i] = dest[length - i - 1];
    dest[length - i - 1] = temp;
  }
}

