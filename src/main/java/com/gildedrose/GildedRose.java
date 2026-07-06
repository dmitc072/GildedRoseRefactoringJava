package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {


        for (int i = 0; i < items.length; i++) {
            boolean isAgedBrie = items[i].name.equals("Aged Brie");
            boolean isBackstage = items[i].name.equals("Backstage passes to a TAFKAL80ETC concert");
            boolean isSurfuras = items[i].name.equals("Sulfuras, Hand of Ragnaros");

            //
            if (!isAgedBrie && !isBackstage) {
                if (items[i].quality > 0) {
                    if (!isSurfuras) {
                        items[i].quality -= 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality += 1;

                    if (isBackstage) {
                        if (items[i].sellIn < 11 && items[i].quality < 50) {
                                items[i].quality += 1;
                        }
                        if (items[i].sellIn < 6 && items[i].quality < 50) {
                                items[i].quality += 1;
                        }
                    }
                }
            }

            //
            if (!isSurfuras) {
                items[i].sellIn -= 1;
            }

            //
            if (items[i].sellIn < 0) {
                if (!isAgedBrie) {
                    if (!isBackstage) {
                        if (items[i].quality > 0) {
                            if (!isSurfuras) {
                                items[i].quality -= 1;
                            }
                        }
                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality += 1;
                    }
                }
            }
        }
    }
}
