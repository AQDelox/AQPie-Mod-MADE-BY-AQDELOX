package com.aq.jaqmod.LootTable;

import com.aq.jaqmod.item.AQPie;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;

public class LootTableModifier {

    public static void ModifyLootTables() {

        LootTableEvents.MODIFY.register((key, tableBuilder, source,registries) -> {

            if (source.isBuiltin() && BuiltInLootTables.NETHER_BRIDGE.equals(key)) {

                LootPool.Builder pool = LootPool.lootPool().add(LootItem.lootTableItem(AQPie.AQ_Pie).when(LootItemRandomChanceCondition.randomChance(0.20F)));
                

                tableBuilder.withPool(pool);


            }
        });
    }

}
