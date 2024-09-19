package com.doctorsmp.bleb_rancher;

import com.doctorsmp.bleb_rancher.registry.BlebItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlebRancher implements ModInitializer {
	public static final String MOD_ID = "bleb_rancher";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlebItems.register();
	}
}