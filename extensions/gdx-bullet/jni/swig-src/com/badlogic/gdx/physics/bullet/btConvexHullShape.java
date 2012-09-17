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

public class btConvexHullShape extends btPolyhedralConvexAabbCachingShape {
  private long swigCPtr;

  protected btConvexHullShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btConvexHullShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConvexHullShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConvexHullShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btConvexHullShape(float[] points, int numPoints, int stride) {
    this(gdxBulletJNI.new_btConvexHullShape__SWIG_0(points, numPoints, stride), true);
  }

  public btConvexHullShape(float[] points, int numPoints) {
    this(gdxBulletJNI.new_btConvexHullShape__SWIG_1(points, numPoints), true);
  }

  public btConvexHullShape(float[] points) {
    this(gdxBulletJNI.new_btConvexHullShape__SWIG_2(points), true);
  }

  public btConvexHullShape() {
    this(gdxBulletJNI.new_btConvexHullShape__SWIG_3(), true);
  }

  public void addPoint(Vector3 point) {
    gdxBulletJNI.btConvexHullShape_addPoint(swigCPtr, this, point);
  }

  public btVector3 getUnscaledPoints() {
    long cPtr = gdxBulletJNI.btConvexHullShape_getUnscaledPoints__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btVector3 getPoints() {
    long cPtr = gdxBulletJNI.btConvexHullShape_getPoints(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public Vector3 getScaledPoint(int i) {
	return gdxBulletJNI.btConvexHullShape_getScaledPoint(swigCPtr, this, i);
}

  public int getNumPoints() {
    return gdxBulletJNI.btConvexHullShape_getNumPoints(swigCPtr, this);
  }

}
