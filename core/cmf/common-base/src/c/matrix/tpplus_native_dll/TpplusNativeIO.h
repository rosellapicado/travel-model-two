/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class TpplusNativeIO */

#ifndef _Included_TpplusNativeIO
#define _Included_TpplusNativeIO
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     TpplusNativeIO
 * Method:    tppInitDllNative
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_TpplusNativeIO_tppInitDllNative
  (JNIEnv *, jclass);

/*
 * Class:     TpplusNativeIO
 * Method:    tppGetNumberOfRowsNative
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_TpplusNativeIO_tppGetNumberOfRowsNative
  (JNIEnv *, jclass, jstring);

/*
 * Class:     TpplusNativeIO
 * Method:    tppGetNumberOfTablesNative
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_TpplusNativeIO_tppGetNumberOfTablesNative
  (JNIEnv *, jclass, jstring);
  
/*
 * Class:     TpplusNativeIO
 * Method:    tppGetTableNameNative
 * Signature: (Ljava/lang/String;)I
 */
JNIEXPORT jstring JNICALL Java_TpplusNativeIO_tppGetTableNameNative
  (JNIEnv *, jclass, jstring, jint);  

/*
 * Class:     TpplusNativeIO
 * Method:    tppReadTableNative
 * Signature: (Ljava/lang/String;[D)V
 */
JNIEXPORT void JNICALL Java_TpplusNativeIO_tppReadTableNative
  (JNIEnv *, jclass, jstring, jfloatArray, jstring, jint, jint, jint); 

/*
 * Class:     TpplusNativeIO
 * Method:    tppWriteNative
 * Signature: (Ljava/lang/String;II[D)V
 */
JNIEXPORT void JNICALL Java_TpplusNativeIO_tppWriteNative
  (JNIEnv *, jclass, jstring, jint, jint, jdoubleArray);

#ifdef __cplusplus
}
#endif
#endif
