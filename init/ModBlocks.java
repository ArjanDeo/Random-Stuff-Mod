package com.republicofgamers.randomstuffmod.init;

import java.util.ArrayList;
import java.util.List;

import com.republicofgamers.randomstuffmod.blocks.AuthCauldron;
import com.republicofgamers.randomstuffmod.blocks.BlockBase;
import com.republicofgamers.randomstuffmod.blocks.BlockCopperChest;
import com.republicofgamers.randomstuffmod.blocks.BlockDirts;
import com.republicofgamers.randomstuffmod.blocks.BlockElectricSinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.BlockGlowstoneGenerator;
import com.republicofgamers.randomstuffmod.blocks.BlockLeaf;
import com.republicofgamers.randomstuffmod.blocks.BlockLogs;
import com.republicofgamers.randomstuffmod.blocks.BlockOres;
import com.republicofgamers.randomstuffmod.blocks.BlockPlank;
import com.republicofgamers.randomstuffmod.blocks.BlockSaplings;
import com.republicofgamers.randomstuffmod.blocks.Computer;
import com.republicofgamers.randomstuffmod.blocks.CookieJar;
import com.republicofgamers.randomstuffmod.blocks.DvdPlayer;
import com.republicofgamers.randomstuffmod.blocks.KikiDoYouLoveMe;
import com.republicofgamers.randomstuffmod.blocks.Laptop;
import com.republicofgamers.randomstuffmod.blocks.MonitorNormal;
import com.republicofgamers.randomstuffmod.blocks.RecordPlayer;
import com.republicofgamers.randomstuffmod.blocks.RubyBlock;
import com.republicofgamers.randomstuffmod.blocks.Speaker;
import com.republicofgamers.randomstuffmod.blocks.SwitchDock;
import com.republicofgamers.randomstuffmod.blocks.Tv;
import com.republicofgamers.randomstuffmod.blocks.machines.sinterer.BlockSinteringFurnace;
import com.republicofgamers.randomstuffmod.items.Cup;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;



public class ModBlocks 
{
   public static final List<Block> BLOCKS = new ArrayList<Block>();

   public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
   public static final Block LAPTOP = new Laptop("laptop", Material.ANVIL);
   public static final Block CUP = new Cup("cup", Material.GLASS);
   public static final Block LEAVES = new BlockLeaf("leaves");
   public static final Block PLANKS = new BlockPlank("planks");
   public static final Block LOGS = new BlockLogs("log");
   public static final Block SAPLINGS = new BlockSaplings("sapling");
   public static final Block DIRT = new BlockDirts("dirt");
   public static final Block COPPER_CHEST = new BlockCopperChest("copper_chest");
   public static final Block ORE_END = new BlockOres("ore_end", "end");
   public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
   public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
   public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON);
   public static final Block SINTERING_FURNACE = new BlockSinteringFurnace("sintering_furnace");
   public static final Block GLOWSTONE_GENERATOR = new BlockGlowstoneGenerator("glowstone_generator");
   public static final Block ELECTRIC_SINTERING_FURNACE = new BlockElectricSinteringFurnace("electric_sintering_furnace");
   public static final Block COMPUTER = new Computer("computer", Material.IRON);
   public static final Block BLOCKSANTAHAT = new Computer("santa_hat", Material.IRON);
   public static final Block COOKIE_JAR = new CookieJar("cookie_jar", Material.GLASS);
   public static final Block TV = new Tv("tv", Material.IRON);
   public static final Block MONITOR_NORMAL = new MonitorNormal("monitor_normal", Material.IRON);
   public static final Block RECORD_PLAYER = new RecordPlayer("record_player", Material.WOOD);
   public static final Block NINTENDO_SWITCH_DOCK = new SwitchDock("switch_dock", Material.IRON);
   public static final Block KIKI_DO_YOU_LOVE_ME = new KikiDoYouLoveMe("kiki_do_you_love_me", Material.IRON);
   public static final Block DVD_PLAYER = new DvdPlayer("dvd_player", Material.IRON);
   public static final Block SPEAKER = new Speaker("speaker", Material.IRON);
   public static final Block MOUSE = new Speaker("mouse", Material.IRON);
   public static final Block AUTH_CAULDRON = new AuthCauldron("auth_coal", Material.IRON);
}
