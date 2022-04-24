
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starbound.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StarboundModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("starbound", "moon_dust_placing"), new SoundEvent(new ResourceLocation("starbound", "moon_dust_placing")));
		REGISTRY.put(new ResourceLocation("starbound", "moon_dust_broken"), new SoundEvent(new ResourceLocation("starbound", "moon_dust_broken")));
		REGISTRY.put(new ResourceLocation("starbound", "moon_dust_walking/running"),
				new SoundEvent(new ResourceLocation("starbound", "moon_dust_walking/running")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
