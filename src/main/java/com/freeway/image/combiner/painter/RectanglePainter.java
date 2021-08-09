package com.freeway.image.combiner.painter;

import com.freeway.image.combiner.element.CombineElement;
import com.freeway.image.combiner.element.ImageElement;
import com.freeway.image.combiner.element.RectangleElement;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @Author zhaoqing.chen
 * @Date 2020/8/21
 * @Description 矩形绘制器
 */
public class RectanglePainter implements IPainter {

    @Override
    public void draw(Graphics2D g, CombineElement element, int canvasWidth) {

        //强制转成子类
        RectangleElement rectangleElement = (RectangleElement) element;

        //设置颜色
        g.setColor(rectangleElement.getColor());

        //设置居中
        if (rectangleElement.isCenter()) {
            int centerX = (canvasWidth - rectangleElement.getWidth()) / 2;
            rectangleElement.setX(centerX);
        }

        //设置透明度
        g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, rectangleElement.getAlpha()));

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.fillRoundRect(rectangleElement.getX(), rectangleElement.getY(), rectangleElement.getWidth(), rectangleElement.getHeight(), rectangleElement.getRoundCorner(), rectangleElement.getRoundCorner());
    }
}

