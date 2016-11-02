#include <jni.h>
#include <string>

extern "C"
jstring
Java_com_example_c_11_mainC_1_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
