/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.narutomod;

import net.narutomod.gui.GuiTeamManager;
import net.narutomod.gui.GuiScrollWaterStreamGui;
import net.narutomod.gui.GuiScrollWaterShockwaveGui;
import net.narutomod.gui.GuiScrollWaterSharkGui;
import net.narutomod.gui.GuiScrollWaterPrisonGui;
import net.narutomod.gui.GuiScrollWaterDragonGui;
import net.narutomod.gui.GuiScrollTransformationGui;
import net.narutomod.gui.GuiScrollSwampPitGui;
import net.narutomod.gui.GuiScrollShadowImitationGui;
import net.narutomod.gui.GuiScrollSealingChainsGui;
import net.narutomod.gui.GuiScrollSealing4SymbolsGui;
import net.narutomod.gui.GuiScrollRasenshurikenGui;
import net.narutomod.gui.GuiScrollRasenganGui;
import net.narutomod.gui.GuiScrollPuppetGui;
import net.narutomod.gui.GuiScrollPoisonMistGui;
import net.narutomod.gui.GuiScrollMultiSizeGui;
import net.narutomod.gui.GuiScrollMindTransferGui;
import net.narutomod.gui.GuiScrollLightningPantherGui;
import net.narutomod.gui.GuiScrollLightningChakraModeGui;
import net.narutomod.gui.GuiScrollLightningBeastGui;
import net.narutomod.gui.GuiScrollKirinGui;
import net.narutomod.gui.GuiScrollKikaichuSphereGui;
import net.narutomod.gui.GuiScrollKageBunshinGui;
import net.narutomod.gui.GuiScrollHiraishinGui;
import net.narutomod.gui.GuiScrollHidingInRockGui;
import net.narutomod.gui.GuiScrollHidingInMistGui;
import net.narutomod.gui.GuiScrollHidingInCamouflageGui;
import net.narutomod.gui.GuiScrollHidingInAshGui;
import net.narutomod.gui.GuiScrollHealingGui;
import net.narutomod.gui.GuiScrollGreatFireballGui;
import net.narutomod.gui.GuiScrollGenjutsuGui;
import net.narutomod.gui.GuiScrollFutonVacuumGui;
import net.narutomod.gui.GuiScrollFutonChakraFlowGui;
import net.narutomod.gui.GuiScrollFireStreamGui;
import net.narutomod.gui.GuiScrollFireAnnihilationGui;
import net.narutomod.gui.GuiScrollFalseDarknessGui;
import net.narutomod.gui.GuiScrollEnhancedStrengthGui;
import net.narutomod.gui.GuiScrollEarthWallGui;
import net.narutomod.gui.GuiScrollEarthSpearsGui;
import net.narutomod.gui.GuiScrollEarthSandwichGui;
import net.narutomod.gui.GuiScrollEarthGolemGui;
import net.narutomod.gui.GuiScrollChidoriGui;
import net.narutomod.gui.GuiScrollCellularActivationGui;
import net.narutomod.gui.GuiScrollBodyReplacementGui;
import net.narutomod.gui.GuiScrollBigBlowGui;
import net.narutomod.gui.GuiMedicalScrollGUI;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.discovery.ASMDataTable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class ElementsNarutomodMod implements IFuelHandler, IWorldGenerator {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();
	public ElementsNarutomodMod() {
		sounds.put(new ResourceLocation("narutomod", "Amaterasu"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "Amaterasu")));
		sounds.put(new ResourceLocation("narutomod", "ShinraTensei"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "ShinraTensei")));
		sounds.put(new ResourceLocation("narutomod", "ChibakuTensei"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "ChibakuTensei")));
		sounds.put(new ResourceLocation("narutomod", "byakugan"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "byakugan")));
		sounds.put(new ResourceLocation("narutomod", "FurryRoar"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "FurryRoar")));
		sounds.put(new ResourceLocation("narutomod", "KamuiSFX"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "KamuiSFX")));
		sounds.put(new ResourceLocation("narutomod", "MonsterGrowl"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "MonsterGrowl")));
		sounds.put(new ResourceLocation("narutomod", "KoH_spawn"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "KoH_spawn")));
		sounds.put(new ResourceLocation("narutomod", "HakkeRokujuuyonShou"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "HakkeRokujuuyonShou")));
		sounds.put(new ResourceLocation("narutomod", "HakkeshoKaiten"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "HakkeshoKaiten")));
		sounds.put(new ResourceLocation("narutomod", "HakkeKusho"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "HakkeKusho")));
		sounds.put(new ResourceLocation("narutomod", "MajiNaguri"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "MajiNaguri")));
		sounds.put(new ResourceLocation("narutomod", "hand_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "hand_shoot")));
		sounds.put(new ResourceLocation("narutomod", "nagiharai"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "nagiharai")));
		sounds.put(new ResourceLocation("narutomod", "80GodsPunch"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "80GodsPunch")));
		sounds.put(new ResourceLocation("narutomod", "Kaguya_FinalTSB"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "Kaguya_FinalTSB")));
		sounds.put(new ResourceLocation("narutomod", "BanshoTenin"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "BanshoTenin")));
		sounds.put(new ResourceLocation("narutomod", "sekizo"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "sekizo")));
		sounds.put(new ResourceLocation("narutomod", "yagai"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "yagai")));
		sounds.put(new ResourceLocation("narutomod", "howl_youth"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "howl_youth")));
		sounds.put(new ResourceLocation("narutomod", "crow_call"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "crow_call")));
		sounds.put(new ResourceLocation("narutomod", "genkaihakurinojutsu"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "genkaihakurinojutsu")));
		sounds.put(new ResourceLocation("narutomod", "suiton_suiryuudan"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "suiton_suiryuudan")));
		sounds.put(new ResourceLocation("narutomod", "kirigakurenojutsu"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "kirigakurenojutsu")));
		sounds.put(new ResourceLocation("narutomod", "rasenshuriken"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "rasenshuriken")));
		sounds.put(new ResourceLocation("narutomod", "wind"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "wind")));
		sounds.put(new ResourceLocation("narutomod", "rasenshuriken_explode"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "rasenshuriken_explode")));
		sounds.put(new ResourceLocation("narutomod", "poof"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "poof")));
		sounds.put(new ResourceLocation("narutomod", "rasengan_start"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "rasengan_start")));
		sounds.put(new ResourceLocation("narutomod", "sharingansfx"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "sharingansfx")));
		sounds.put(new ResourceLocation("narutomod", "genjutsu"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "genjutsu")));
		sounds.put(new ResourceLocation("narutomod", "laser_long"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "laser_long")));
		sounds.put(new ResourceLocation("narutomod", "kagebunshin"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "kagebunshin")));
		sounds.put(new ResourceLocation("narutomod", "suironojutsu"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "suironojutsu")));
		sounds.put(new ResourceLocation("narutomod", "bullet"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "bullet")));
		sounds.put(new ResourceLocation("narutomod", "bullet_impact"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "bullet_impact")));
		sounds.put(new ResourceLocation("narutomod", "rocks"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "rocks")));
		sounds.put(new ResourceLocation("narutomod", "rinbo_hengoku"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "rinbo_hengoku")));
		sounds.put(new ResourceLocation("narutomod", "ground_charge"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "ground_charge")));
		sounds.put(new ResourceLocation("narutomod", "jutsu"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "jutsu")));
		sounds.put(new ResourceLocation("narutomod", "hiding_in_ash"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "hiding_in_ash")));
		sounds.put(new ResourceLocation("narutomod", "bijudama"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "bijudama")));
		sounds.put(new ResourceLocation("narutomod", "tengaishinsei"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "tengaishinsei")));
		sounds.put(new ResourceLocation("narutomod", "sando_no_jutsu"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "sando_no_jutsu")));
		sounds.put(new ResourceLocation("narutomod", "yominuma"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "yominuma")));
		sounds.put(new ResourceLocation("narutomod", "suikodannojutsu"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "suikodannojutsu")));
		sounds.put(new ResourceLocation("narutomod", "daibakusuishoha"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "daibakusuishoha")));
		sounds.put(new ResourceLocation("narutomod", "sabakusoso"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "sabakusoso")));
		sounds.put(new ResourceLocation("narutomod", "spiked"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "spiked")));
		sounds.put(new ResourceLocation("narutomod", "ice_shoot"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "ice_shoot")));
		sounds.put(new ResourceLocation("narutomod", "makyohyosho"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "makyohyosho")));
		sounds.put(new ResourceLocation("narutomod", "ice_formation"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "ice_formation")));
		sounds.put(new ResourceLocation("narutomod", "ice_shoot_small"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "ice_shoot_small")));
		sounds.put(new ResourceLocation("narutomod", "c3"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "c3")));
		sounds.put(new ResourceLocation("narutomod", "katsu"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "katsu")));
		sounds.put(new ResourceLocation("narutomod", "hand_press"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "hand_press")));
		sounds.put(new ResourceLocation("narutomod", "chains"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "chains")));
		sounds.put(new ResourceLocation("narutomod", "kyuubi_howl"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "kyuubi_howl")));
		sounds.put(new ResourceLocation("narutomod", "kyuubi_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "kyuubi_death")));
		sounds.put(new ResourceLocation("narutomod", "movement"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "movement")));
		sounds.put(new ResourceLocation("narutomod", "lasercircus"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "lasercircus")));
		sounds.put(new ResourceLocation("narutomod", "mokujin_no_jutsu"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "mokujin_no_jutsu")));
		sounds.put(new ResourceLocation("narutomod", "wood_click"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "wood_click")));
		sounds.put(new ResourceLocation("narutomod", "kairikimuso"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "kairikimuso")));
		sounds.put(new ResourceLocation("narutomod", "mindtransfer"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "mindtransfer")));
		sounds.put(new ResourceLocation("narutomod", "shadow_sfx"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "shadow_sfx")));
		sounds.put(new ResourceLocation("narutomod", "charging_chakra"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "charging_chakra")));
		sounds.put(new ResourceLocation("narutomod", "charge_ground"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "charge_ground")));
		sounds.put(new ResourceLocation("narutomod", "explosion"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "explosion")));
		sounds.put(new ResourceLocation("narutomod", "bonecrack"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "bonecrack")));
		sounds.put(new ResourceLocation("narutomod", "katon_gokamekeku"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "katon_gokamekeku")));
		sounds.put(new ResourceLocation("narutomod", "flamethrow"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "flamethrow")));
		sounds.put(new ResourceLocation("narutomod", "woodspawn"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "woodspawn")));
		sounds.put(new ResourceLocation("narutomod", "electricity"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "electricity")));
		sounds.put(new ResourceLocation("narutomod", "chidori"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "chidori")));
		sounds.put(new ResourceLocation("narutomod", "bugs"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "bugs")));
		sounds.put(new ResourceLocation("narutomod", "woodgrow"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "woodgrow")));
		sounds.put(new ResourceLocation("narutomod", "amaterasu2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "amaterasu2")));
		sounds.put(new ResourceLocation("narutomod", "throwpunch"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "throwpunch")));
		sounds.put(new ResourceLocation("narutomod", "tenseiblastcharge"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "tenseiblastcharge")));
		sounds.put(new ResourceLocation("narutomod", "laser"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "laser")));
		sounds.put(new ResourceLocation("narutomod", "magatama_spin"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "magatama_spin")));
		sounds.put(new ResourceLocation("narutomod", "laser_short"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "laser_short")));
		sounds.put(new ResourceLocation("narutomod", "intonraiha"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "intonraiha")));
		sounds.put(new ResourceLocation("narutomod", "rasengan_during"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "rasengan_during")));
		sounds.put(new ResourceLocation("narutomod", "windecho"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "windecho")));
		sounds.put(new ResourceLocation("narutomod", "opengate"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "opengate")));
		sounds.put(new ResourceLocation("narutomod", "eightgatesrelease"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "eightgatesrelease")));
		sounds.put(new ResourceLocation("narutomod", "waterblast"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "waterblast")));
		sounds.put(new ResourceLocation("narutomod", "kuchiyosenojutsu"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "kuchiyosenojutsu")));
		sounds.put(new ResourceLocation("narutomod", "dragon_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "dragon_roar")));
		sounds.put(new ResourceLocation("narutomod", "lightning_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "lightning_shoot")));
		sounds.put(new ResourceLocation("narutomod", "kirin_dialog"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "kirin_dialog")));
		sounds.put(new ResourceLocation("narutomod", "shinsusenju"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "shinsusenju")));
		sounds.put(new ResourceLocation("narutomod", "snake_hiss"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "snake_hiss")));
		sounds.put(new ResourceLocation("narutomod", "dingding"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "dingding")));
		sounds.put(new ResourceLocation("narutomod", "senbon"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "senbon")));
		sounds.put(new ResourceLocation("narutomod", "gunbaiwind"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "gunbaiwind")));
		sounds.put(new ResourceLocation("narutomod", "chainsound"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "chainsound")));
		sounds.put(new ResourceLocation("narutomod", "hiruko_tail"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "hiruko_tail")));
		sounds.put(new ResourceLocation("narutomod", "senbon_impact"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "senbon_impact")));
		sounds.put(new ResourceLocation("narutomod", "roar"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "roar")));
		sounds.put(new ResourceLocation("narutomod", "hirudora"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "hirudora")));
		sounds.put(new ResourceLocation("narutomod", "dojutsu"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "dojutsu")));
		sounds.put(new ResourceLocation("narutomod", "swoosh"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "swoosh")));
		sounds.put(new ResourceLocation("narutomod", "highpitch"), new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "highpitch")));
		sounds.put(new ResourceLocation("narutomod", "fourtails_idle1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "fourtails_idle1")));
		sounds.put(new ResourceLocation("narutomod", "fourtails_idle2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "fourtails_idle2")));
		sounds.put(new ResourceLocation("narutomod", "fourtails_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "fourtails_hurt")));
		sounds.put(new ResourceLocation("narutomod", "fourtails_defeat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "fourtails_defeat")));
		sounds.put(new ResourceLocation("narutomod", "shukaku_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("narutomod", "shukaku_roar")));
	}

	public void preInit(FMLPreInitializationEvent event) {
		try {
			for (ASMDataTable.ASMData asmData : event.getAsmData().getAll(ModElement.Tag.class.getName())) {
				Class<?> clazz = Class.forName(asmData.getClassName());
				if (clazz.getSuperclass() == ElementsNarutomodMod.ModElement.class)
					elements.add((ElementsNarutomodMod.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(ElementsNarutomodMod.ModElement::initElements);
		this.addNetworkMessage(NarutomodModVariables.WorldSavedDataSyncMessageHandler.class, NarutomodModVariables.WorldSavedDataSyncMessage.class,
				Side.SERVER, Side.CLIENT);
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData mapdata = NarutomodModVariables.MapVariables.get(event.player.world);
			WorldSavedData worlddata = NarutomodModVariables.WorldVariables.get(event.player.world);
			if (mapdata != null)
				NarutomodMod.PACKET_HANDLER.sendTo(new NarutomodModVariables.WorldSavedDataSyncMessage(0, mapdata), (EntityPlayerMP) event.player);
			if (worlddata != null)
				NarutomodMod.PACKET_HANDLER.sendTo(new NarutomodModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP) event.player);
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.player.world.isRemote) {
			WorldSavedData worlddata = NarutomodModVariables.WorldVariables.get(event.player.world);
			if (worlddata != null)
				NarutomodMod.PACKET_HANDLER.sendTo(new NarutomodModVariables.WorldSavedDataSyncMessage(1, worlddata), (EntityPlayerMP) event.player);
		}
	}
	private int messageID = 0;
	public <T extends IMessage, V extends IMessage> void addNetworkMessage(Class<? extends IMessageHandler<T, V>> handler, Class<T> messageClass,
			Side... sides) {
		for (Side side : sides)
			NarutomodMod.PACKET_HANDLER.registerMessage(handler, messageClass, messageID, side);
		messageID++;
	}
	public static class GuiHandler implements IGuiHandler {
		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GuiMedicalScrollGUI.GUIID)
				return new GuiMedicalScrollGUI.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollHidingInRockGui.GUIID)
				return new GuiScrollHidingInRockGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollLightningChakraModeGui.GUIID)
				return new GuiScrollLightningChakraModeGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollEarthWallGui.GUIID)
				return new GuiScrollEarthWallGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollEarthSandwichGui.GUIID)
				return new GuiScrollEarthSandwichGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollSwampPitGui.GUIID)
				return new GuiScrollSwampPitGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollChidoriGui.GUIID)
				return new GuiScrollChidoriGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollLightningBeastGui.GUIID)
				return new GuiScrollLightningBeastGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollFutonChakraFlowGui.GUIID)
				return new GuiScrollFutonChakraFlowGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollRasenshurikenGui.GUIID)
				return new GuiScrollRasenshurikenGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollFutonVacuumGui.GUIID)
				return new GuiScrollFutonVacuumGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollBigBlowGui.GUIID)
				return new GuiScrollBigBlowGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollGenjutsuGui.GUIID)
				return new GuiScrollGenjutsuGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollBodyReplacementGui.GUIID)
				return new GuiScrollBodyReplacementGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollKageBunshinGui.GUIID)
				return new GuiScrollKageBunshinGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollRasenganGui.GUIID)
				return new GuiScrollRasenganGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollGreatFireballGui.GUIID)
				return new GuiScrollGreatFireballGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollFireAnnihilationGui.GUIID)
				return new GuiScrollFireAnnihilationGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollHidingInAshGui.GUIID)
				return new GuiScrollHidingInAshGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollHidingInMistGui.GUIID)
				return new GuiScrollHidingInMistGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollWaterStreamGui.GUIID)
				return new GuiScrollWaterStreamGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollWaterDragonGui.GUIID)
				return new GuiScrollWaterDragonGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollWaterPrisonGui.GUIID)
				return new GuiScrollWaterPrisonGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollWaterSharkGui.GUIID)
				return new GuiScrollWaterSharkGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollWaterShockwaveGui.GUIID)
				return new GuiScrollWaterShockwaveGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollHealingGui.GUIID)
				return new GuiScrollHealingGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiTeamManager.GUIID)
				return new GuiTeamManager.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollPoisonMistGui.GUIID)
				return new GuiScrollPoisonMistGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollCellularActivationGui.GUIID)
				return new GuiScrollCellularActivationGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollEnhancedStrengthGui.GUIID)
				return new GuiScrollEnhancedStrengthGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollMultiSizeGui.GUIID)
				return new GuiScrollMultiSizeGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollFalseDarknessGui.GUIID)
				return new GuiScrollFalseDarknessGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollEarthSpearsGui.GUIID)
				return new GuiScrollEarthSpearsGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollShadowImitationGui.GUIID)
				return new GuiScrollShadowImitationGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollMindTransferGui.GUIID)
				return new GuiScrollMindTransferGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollFireStreamGui.GUIID)
				return new GuiScrollFireStreamGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollHidingInCamouflageGui.GUIID)
				return new GuiScrollHidingInCamouflageGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollKikaichuSphereGui.GUIID)
				return new GuiScrollKikaichuSphereGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollTransformationGui.GUIID)
				return new GuiScrollTransformationGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollSealing4SymbolsGui.GUIID)
				return new GuiScrollSealing4SymbolsGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollLightningPantherGui.GUIID)
				return new GuiScrollLightningPantherGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollPuppetGui.GUIID)
				return new GuiScrollPuppetGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollKirinGui.GUIID)
				return new GuiScrollKirinGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollEarthGolemGui.GUIID)
				return new GuiScrollEarthGolemGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollSealingChainsGui.GUIID)
				return new GuiScrollSealingChainsGui.GuiContainerMod(world, x, y, z, player);
			if (id == GuiScrollHiraishinGui.GUIID)
				return new GuiScrollHiraishinGui.GuiContainerMod(world, x, y, z, player);
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == GuiMedicalScrollGUI.GUIID)
				return new GuiMedicalScrollGUI.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollHidingInRockGui.GUIID)
				return new GuiScrollHidingInRockGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollLightningChakraModeGui.GUIID)
				return new GuiScrollLightningChakraModeGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollEarthWallGui.GUIID)
				return new GuiScrollEarthWallGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollEarthSandwichGui.GUIID)
				return new GuiScrollEarthSandwichGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollSwampPitGui.GUIID)
				return new GuiScrollSwampPitGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollChidoriGui.GUIID)
				return new GuiScrollChidoriGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollLightningBeastGui.GUIID)
				return new GuiScrollLightningBeastGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollFutonChakraFlowGui.GUIID)
				return new GuiScrollFutonChakraFlowGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollRasenshurikenGui.GUIID)
				return new GuiScrollRasenshurikenGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollFutonVacuumGui.GUIID)
				return new GuiScrollFutonVacuumGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollBigBlowGui.GUIID)
				return new GuiScrollBigBlowGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollGenjutsuGui.GUIID)
				return new GuiScrollGenjutsuGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollBodyReplacementGui.GUIID)
				return new GuiScrollBodyReplacementGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollKageBunshinGui.GUIID)
				return new GuiScrollKageBunshinGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollRasenganGui.GUIID)
				return new GuiScrollRasenganGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollGreatFireballGui.GUIID)
				return new GuiScrollGreatFireballGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollFireAnnihilationGui.GUIID)
				return new GuiScrollFireAnnihilationGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollHidingInAshGui.GUIID)
				return new GuiScrollHidingInAshGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollHidingInMistGui.GUIID)
				return new GuiScrollHidingInMistGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollWaterStreamGui.GUIID)
				return new GuiScrollWaterStreamGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollWaterDragonGui.GUIID)
				return new GuiScrollWaterDragonGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollWaterPrisonGui.GUIID)
				return new GuiScrollWaterPrisonGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollWaterSharkGui.GUIID)
				return new GuiScrollWaterSharkGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollWaterShockwaveGui.GUIID)
				return new GuiScrollWaterShockwaveGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollHealingGui.GUIID)
				return new GuiScrollHealingGui.GuiWindow(world, x, y, z, player);
			if (id == GuiTeamManager.GUIID)
				return new GuiTeamManager.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollPoisonMistGui.GUIID)
				return new GuiScrollPoisonMistGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollCellularActivationGui.GUIID)
				return new GuiScrollCellularActivationGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollEnhancedStrengthGui.GUIID)
				return new GuiScrollEnhancedStrengthGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollMultiSizeGui.GUIID)
				return new GuiScrollMultiSizeGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollFalseDarknessGui.GUIID)
				return new GuiScrollFalseDarknessGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollEarthSpearsGui.GUIID)
				return new GuiScrollEarthSpearsGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollShadowImitationGui.GUIID)
				return new GuiScrollShadowImitationGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollMindTransferGui.GUIID)
				return new GuiScrollMindTransferGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollFireStreamGui.GUIID)
				return new GuiScrollFireStreamGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollHidingInCamouflageGui.GUIID)
				return new GuiScrollHidingInCamouflageGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollKikaichuSphereGui.GUIID)
				return new GuiScrollKikaichuSphereGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollTransformationGui.GUIID)
				return new GuiScrollTransformationGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollSealing4SymbolsGui.GUIID)
				return new GuiScrollSealing4SymbolsGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollLightningPantherGui.GUIID)
				return new GuiScrollLightningPantherGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollPuppetGui.GUIID)
				return new GuiScrollPuppetGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollKirinGui.GUIID)
				return new GuiScrollKirinGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollEarthGolemGui.GUIID)
				return new GuiScrollEarthGolemGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollSealingChainsGui.GUIID)
				return new GuiScrollSealingChainsGui.GuiWindow(world, x, y, z, player);
			if (id == GuiScrollHiraishinGui.GUIID)
				return new GuiScrollHiraishinGui.GuiWindow(world, x, y, z, player);
			return null;
		}
	}
	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<Biome>> getBiomes() {
		return biomes;
	}

	public List<Supplier<EntityEntry>> getEntities() {
		return entities;
	}

	public List<Supplier<Potion>> getPotions() {
		return potions;
	}
	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}
		protected final ElementsNarutomodMod elements;
		protected final int sortid;
		public ModElement(ElementsNarutomodMod elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
