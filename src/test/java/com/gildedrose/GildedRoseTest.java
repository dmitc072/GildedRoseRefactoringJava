package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void normalItemQualityDecreasesByOne() {
        Item[] items = { new Item("Normal Item", 10, 20) };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(19, items[0].quality);
    }

    @Test
    void normalItemSellInDecreasesByOne(){
        Item[] items = { new Item("Normal Item", 20, 20) };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(19,items[0].sellIn);
    }

    @Test
    void normalItemQualityNeverNegative(){
        Item[] items = { new Item("Normal Item", 20, 1) };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0,items[0].quality);
    }

    @Test
    void expiredNormalItemDegradesTwiceAsFast() {
        Item[] items = { new Item("Normal Item", 0, 10) };

        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(8, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

   //Aged Brie
    @Test
    void agedBrieQualityIncreasesByOne(){
        Item[] items = {new Item("Aged Brie", 10, 3)};
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals((4),items[0].quality);
    }

    @Test
    void agedBrieQualityNeverExceeds50(){
        Item[] items = { new Item("Aged Brie", 10, 50) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(50, items[0].quality);
    }

    @Test
    void expiredAgedBrieIncreasesByTwo(){
        Item[] items = { new Item("Aged Brie", 0, 10) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(12, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    //Sulfuras
    @Test
    void sulfurasNeverChangesQuality(){
    Item[] items = { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
    GildedRose app = new GildedRose(items);

    app.updateQuality();

    assertEquals(80, items[0].quality);
    }

    @Test
    void sulfurasNeverChangesSellIn(){
        Item[] items = { new Item("Sulfuras, Hand of Ragnaros", 5, 80) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(5, items[0].sellIn);
    }

    //Backstage Passes
    @Test
    void backstagePassesIncreaseByOneWhenSellInGreaterThan10(){
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(21, items[0].quality);
        assertEquals(10, items[0].sellIn);
    }

    @Test
    void backstagePassesIncreaseByTwoWhenSellInIs10(){
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(22, items[0].quality);
        assertEquals(9, items[0].sellIn);
    }

    @Test
    void backstagePassesIncreaseByThreeWhenSellInIs5(){
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(23, items[0].quality);
        assertEquals(4, items[0].sellIn);
    }


    @Test
    void backstagePassesDropToZeroAfterConcert(){
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(0, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    void backstagePassesNeverExceed50(){
        Item[] items = { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals(50, items[0].quality);
    }

//    @Test
//    void conjuredItemsDegradeTwiceAsFast(){
//        Item[] items = {new Item("Conjured Cake", 10,33)};
//        GildedRose app = new GildedRose(items);
//
//        app.updateQuality();
//
//        assertEquals(31,items[0].quality);
//        assertEquals(9,items[0].sellIn);
//    }


}
