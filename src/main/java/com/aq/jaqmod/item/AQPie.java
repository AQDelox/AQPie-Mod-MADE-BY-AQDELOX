package com.aq.jaqmod.item;

import com.aq.jaqmod.AQDMod;

import net.minecraft.core.component.DataComponents;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class AQPie {

    public static final ResourceKey<Item>  AQ_PIE_kEY = ResourceKey.create(Registries.ITEM, AQDMod.id("aq_pie"));

    public static final Consumable REGEN_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood().onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 8 * 30, 4), 1.0F)).build();

    public static final FoodProperties REGEN_FOOD_COMPONENT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.9F).alwaysEdible().build();

    public static final Item AQ_Pie = new Item(
            new Item.Properties()
                    .setId(AQ_PIE_kEY) 
                    .component(DataComponents.FOOD, REGEN_FOOD_COMPONENT) 
                    .component(DataComponents.CONSUMABLE, REGEN_FOOD_CONSUMABLE_COMPONENT).component(DataComponents.ITEM_MODEL, AQDMod.id("aq_pie")) 
    );

    public static void RegisterModItems() {

        Registry.register(BuiltInRegistries.ITEM, AQDMod.id("aq_pie"), AQ_Pie);
    }

}


