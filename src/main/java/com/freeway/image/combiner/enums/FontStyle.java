package com.freeway.image.combiner.enums;

/**
 * 字体类型
 *
 * @author caizi
 * @since 2021-06-17
 */
public enum FontStyle {
    PLAIN(0, "普通"),
    BOLD(1, "加粗"),
    ITALIC(2, "斜体"),
    BOLD_ITALIC(3, "加粗斜体");

    private final Integer number;
    private final String desc;

    FontStyle(Integer number, String desc) {
        this.number = number;
        this.desc = desc;
    }

    public Integer getNumber() {
        return number;
    }

    /**
     * 根据枚举值获取枚举
     */
    public static FontStyle forNumber(Integer value) {
        switch (value) {
            case 0:
                return PLAIN;
            case 1:
                return BOLD;
            case 2:
                return ITALIC;
            case 3:
                return BOLD_ITALIC;
            default:
                return null;
        }
    }
}
