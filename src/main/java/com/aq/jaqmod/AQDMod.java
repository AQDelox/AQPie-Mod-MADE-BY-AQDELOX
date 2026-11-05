package com.aq.jaqmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aq.jaqmod.item.AQPie;

public class AQDMod implements ModInitializer {
	public static final String MOD_ID = "aqd-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		AQPie.RegisterModItems();

		LOGGER.info("AQMOD RAN SUCCESSFULLY!");
		

		
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
