package net.theelementguy.mmmythics;

import com.mojang.serialization.MapCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.theelementguy.tegmoremetals.MoreMetalsMod;
import org.jetbrains.annotations.NotNull;

public class ModRegisters {

	public static final DeferredRegister<@NotNull MapCodec<? extends IGlobalLootModifier>> LOOT_MODIFIERS = DeferredRegister.create(NeoForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, CelestialBronzeMod.MOD_ID);

	public static void register(IEventBus bus) {
		LOOT_MODIFIERS.register(bus);
	}

}
