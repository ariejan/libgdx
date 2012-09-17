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

public class btGeneric6DofSpringConstraintData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btGeneric6DofSpringConstraintData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btGeneric6DofSpringConstraintData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btGeneric6DofSpringConstraintData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_6dofData(btGeneric6DofConstraintData value) {
    gdxBulletJNI.btGeneric6DofSpringConstraintData_m_6dofData_set(swigCPtr, this, btGeneric6DofConstraintData.getCPtr(value), value);
  }

  public btGeneric6DofConstraintData getM_6dofData() {
    long cPtr = gdxBulletJNI.btGeneric6DofSpringConstraintData_m_6dofData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btGeneric6DofConstraintData(cPtr, false);
  }

  public void setM_springEnabled(int[] value) {
    gdxBulletJNI.btGeneric6DofSpringConstraintData_m_springEnabled_set(swigCPtr, this, value);
  }

  public int[] getM_springEnabled() {
    return gdxBulletJNI.btGeneric6DofSpringConstraintData_m_springEnabled_get(swigCPtr, this);
  }

  public void setM_equilibriumPoint(float[] value) {
    gdxBulletJNI.btGeneric6DofSpringConstraintData_m_equilibriumPoint_set(swigCPtr, this, value);
  }

  public float[] getM_equilibriumPoint() {
    return gdxBulletJNI.btGeneric6DofSpringConstraintData_m_equilibriumPoint_get(swigCPtr, this);
  }

  public void setM_springStiffness(float[] value) {
    gdxBulletJNI.btGeneric6DofSpringConstraintData_m_springStiffness_set(swigCPtr, this, value);
  }

  public float[] getM_springStiffness() {
    return gdxBulletJNI.btGeneric6DofSpringConstraintData_m_springStiffness_get(swigCPtr, this);
  }

  public void setM_springDamping(float[] value) {
    gdxBulletJNI.btGeneric6DofSpringConstraintData_m_springDamping_set(swigCPtr, this, value);
  }

  public float[] getM_springDamping() {
    return gdxBulletJNI.btGeneric6DofSpringConstraintData_m_springDamping_get(swigCPtr, this);
  }

  public btGeneric6DofSpringConstraintData() {
    this(gdxBulletJNI.new_btGeneric6DofSpringConstraintData(), true);
  }

}
