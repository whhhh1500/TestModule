package com.cc1500.system.demo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class UpdateImage  {

    public static void main(String[] args) {
        String[] files = {"D:\\image\\8.jpg","D:\\image\\22.jpg"};
        merge(files,"D:\\image\\56.jpg");
    }

    /**
     * 图片拼接
     * 江风成
     * @param files 要拼接的文件列表
     * @return
     */
    public static void merge(String[] files, String savePath) {
        try {
            /* 1 读取第一张图片 */
            File fileOne = new File(files[0]);
            BufferedImage imageFirst = ImageIO.read(fileOne);
            int width = imageFirst.getWidth();// 图片宽度
            int height = imageFirst.getHeight();// 图片高度
            int[] imageArrayFirst = new int[width * height];// 从图片中读取RGB
            imageArrayFirst = imageFirst.getRGB(0, 0, width, height, imageArrayFirst, 0, width);
            /* 1 对第二张图片做相同的处理 */
            File fileTwo = new File(files[1]);
            BufferedImage imageSecond = ImageIO.read(fileTwo);
            int width1 = imageSecond.getWidth();// 图片宽度
            int height1 = imageSecond.getHeight();// 图片高度
            int[] imageArraySecond = new int[width1 * height1];
            imageArraySecond = imageSecond.getRGB(0, 0, width1, height1, imageArraySecond, 0, width1);
            int ww = width > width1 ? width : width1;
// 生成新图片
            BufferedImage imageResult = new BufferedImage(ww, height1 + height, BufferedImage.TYPE_INT_RGB);
            int k = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < ww; j++) {
                    if (width > j) {
                        imageResult.setRGB(j, i, imageArrayFirst[k]);
                        k++;
                    } else {
                        imageResult.setRGB(j, i, -328966);
                    }
                }
            }
            int k1 = 0;
            for (int i1 = 0; i1 < height1; i1++) {
                for (int j1 = 0; j1 < ww; j1++) {
                    if (width1 > j1) {
                        imageResult.setRGB(j1, i1 + height, imageArraySecond[k1]);
                        k1++;
                    } else {
                        imageResult.setRGB(j1, i1 + height, -328966);
                    }

                }
            }
            File outFile = new File(savePath);
            if(!outFile.exists()){
                outFile.createNewFile();
            }
            int temp = savePath.lastIndexOf(".") + 1;
            ImageIO.write(imageResult, savePath.substring(temp), outFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}