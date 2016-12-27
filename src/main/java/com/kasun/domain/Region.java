package com.kasun.domain;

/**
 * Created by kasunk on 12/27/16.
 */
public enum Region {

    Central_Province("Central Province") , Southern_Province("Southern Province"), Uva_Province("Uva Province");

    private String label;

    private Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String byLabel) {

        for (Region region : Region.values()) {

            if (region.equals(byLabel)) {
                return region;
            }
        }
        return null;
    }

}
