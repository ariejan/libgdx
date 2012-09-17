/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;

public class btNullPairCache extends btOverlappingPairCache {
  private long swigCPtr;

  protected btNullPairCache(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btNullPairCache_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btNullPairCache obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btNullPairCache(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btBroadphasePair getOverlappingPairArrayPtr() {
    long cPtr = gdxBulletJNI.btNullPairCache_getOverlappingPairArrayPtr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btBroadphasePair(cPtr, false);
  }

  public btNullPairCache() {
    this(gdxBulletJNI.new_btNullPairCache(), true);
  }

}
