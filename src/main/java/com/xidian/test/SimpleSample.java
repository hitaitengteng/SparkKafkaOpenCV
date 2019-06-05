package com.xidian.test;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

/**
 * @author YuZhansheng
 * @desc
 * @create 2019-06-02 下午10:54
 */
public class SimpleSample {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat mat = Mat.eye(3,3, CvType.CV_8UC1);
        System.out.println(mat.dump());
    }
}
