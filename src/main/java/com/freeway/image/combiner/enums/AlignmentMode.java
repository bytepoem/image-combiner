package com.freeway.image.combiner.enums;

/**
 * 对齐方式
 *
 * @author caizi
 * @since 2021-06-17
 */
public enum AlignmentMode {
    LEFT(0, "left"),
    CENTER(1, "center"),
    RIGHT(2, "right");

    private final Integer number;
    private final String desc;

    AlignmentMode(Integer number, String desc) {
        this.number = number;
        this.desc = desc;
    }

    public Integer getNumber() {
        return number;
    }

    /**
     * 根据枚举值获取枚举
     */
    public static AlignmentMode forNumber(Integer value) {
        switch (value) {
            case 0:
                return LEFT;
            case 1:
                return CENTER;
            case 2:
                return RIGHT;
            default:
                return null;
        }
    }
}
