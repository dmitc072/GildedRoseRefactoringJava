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

    }

    @Test
    void sulfurasNeverChangesSellIn(){

    }

    //Backstage Passes
    @Test
    void backstagePassesIncreaseByOneWhenSellInGreaterThan10(){

    }

    @Test
    void backstagePassesIncreaseByTwoWhenSellInIs10(){

    }

    @Test
    void backstagePassesIncreaseByThreeWhenSellInIs5(){

    }

    @Test
    void backstagePassesDropToZeroAfterConcert(){

    }

    @Test
    void backstagePassesNeverExceed50(){

    }



}
