package com.freeway.image.combiner.element;

import com.freeway.image.combiner.enums.ZoomMode;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

/**
 * @Author zhaoqing.chen
 * @Date 2020/8/21
 * @Description 矩形元素
 */
public class RectangleElement extends CombineElement<RectangleElement> {
    private Integer width;                  //绘制宽度
    private Integer height;                 //绘制高度
    private Integer roundCorner = 0;        //圆角大小
    private Color color = new Color(255, 255, 255);   //颜色，默认白色

    /**
     * @param x        x坐标
     * @param y        y坐标
     * @param width    宽度
     * @param height   高度
     */
    public RectangleElement(int x, int y, int width, int height) {
        this.width = width;
        this.height = height;
        super.setX(x);
        super.setY(y);
    }

    public Integer getWidth() {
        return width;
    }

    public RectangleElement setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public RectangleElement setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getRoundCorner() {
        return roundCorner;
    }

    public RectangleElement setRoundCorner(Integer roundCorner) {
        this.roundCorner = roundCorner;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public RectangleElement setColor(Color color) {
        this.color = color;
        return this;
    }
}
