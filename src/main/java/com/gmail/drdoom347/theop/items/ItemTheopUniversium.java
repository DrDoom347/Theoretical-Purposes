package com.gmail.drdoom347.theop.items;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.gmail.drdoom347.theop.tabs.ModTabs;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ItemTheopUniversium extends ItemTool
{
	// A holder object for the tool material
    	private final float attackDamage;
    	private ToolMaterial material = null;
		// This is a list of
		private static Set<Block> blocks = null;		
		/**
		* This initializes the ItemTheopUniversium object.
		* @param ToolMaterial material
		*/
		public ItemTheopUniversium(ToolMaterial material) {
			super(material, getEffectedBlocks());
			this.material = material;
			this.setCreativeTab(ModTabs.tabTheop);
	        this.attackDamage = 10.0F + material.getDamageVsEntity();
		}
		public float getDamageVsEntity()
	    {
	        return this.material.getDamageVsEntity();
	    }

		/**
		* This create a list of vanilla blocks that the custom
		* axe can be used on.
		* @return Set<Block>
		*/		
		private static Set<Block> getEffectedBlocks() {
			
			if(blocks == null) {
				blocks = new HashSet<Block>();
				// Acacia
				blocks.add(Blocks.ACACIA_DOOR);
				blocks.add(Blocks.ACACIA_FENCE);
				blocks.add(Blocks.ACACIA_FENCE_GATE);
				blocks.add(Blocks.ACACIA_STAIRS);
				// Birch
				blocks.add(Blocks.BIRCH_DOOR);
				blocks.add(Blocks.BIRCH_FENCE);
				blocks.add(Blocks.BIRCH_FENCE_GATE);
				blocks.add(Blocks.BIRCH_STAIRS);
				// Dark Oak
				blocks.add(Blocks.DARK_OAK_DOOR);
				blocks.add(Blocks.DARK_OAK_FENCE);
				blocks.add(Blocks.DARK_OAK_FENCE_GATE);
				blocks.add(Blocks.DARK_OAK_STAIRS);
				// Jungle
				blocks.add(Blocks.JUNGLE_DOOR);
				blocks.add(Blocks.JUNGLE_FENCE);
				blocks.add(Blocks.JUNGLE_FENCE_GATE);
				blocks.add(Blocks.JUNGLE_STAIRS);
				// Oak
				blocks.add(Blocks.OAK_DOOR);
				blocks.add(Blocks.OAK_FENCE);
				blocks.add(Blocks.OAK_FENCE_GATE);
				blocks.add(Blocks.OAK_STAIRS);
				// Spruce
				blocks.add(Blocks.SPRUCE_DOOR);
				blocks.add(Blocks.SPRUCE_FENCE);
				blocks.add(Blocks.SPRUCE_FENCE_GATE);
				blocks.add(Blocks.SPRUCE_STAIRS);
				// Logs
				blocks.add(Blocks.LOG);
				blocks.add(Blocks.LOG2);
				// Leaves
				blocks.add(Blocks.LEAVES);
				blocks.add(Blocks.LEAVES2);
				// Planks
				blocks.add(Blocks.PLANKS);
				// Crafting Table
				blocks.add(Blocks.CRAFTING_TABLE);
				// Pumpkin
				blocks.add(Blocks.PUMPKIN);
				// Lit Pumpkin
				blocks.add(Blocks.LIT_PUMPKIN);
				// Vines
				blocks.add(Blocks.VINE);
				// Melon
				blocks.add(Blocks.MELON_BLOCK);
				// Pickaxe Blocks
				blocks.add(Blocks.ACTIVATOR_RAIL);
				blocks.add(Blocks.COAL_ORE);
				blocks.add(Blocks.COBBLESTONE);
				blocks.add(Blocks.DETECTOR_RAIL);
				blocks.add(Blocks.DIAMOND_BLOCK);
				blocks.add(Blocks.DIAMOND_ORE);
				blocks.add(Blocks.DOUBLE_STONE_SLAB);
				blocks.add(Blocks.GOLDEN_RAIL);
				blocks.add(Blocks.GOLD_BLOCK);
				blocks.add(Blocks.GOLD_ORE);
				blocks.add(Blocks.ICE);
				blocks.add(Blocks.IRON_BLOCK);
				blocks.add(Blocks.IRON_ORE);
				blocks.add(Blocks.LAPIS_BLOCK);
				blocks.add(Blocks.LAPIS_ORE);
				blocks.add(Blocks.LIT_REDSTONE_ORE);
				blocks.add(Blocks.MOSSY_COBBLESTONE);
				blocks.add(Blocks.NETHERRACK);
				blocks.add(Blocks.PACKED_ICE);
				blocks.add(Blocks.RAIL);
				blocks.add(Blocks.REDSTONE_ORE);
				blocks.add(Blocks.SANDSTONE);
				blocks.add(Blocks.RED_SANDSTONE);
				blocks.add(Blocks.STONE);
				blocks.add(Blocks.STONE_SLAB);
				blocks.add(Blocks.STONE_BUTTON);
				blocks.add(Blocks.STONE_PRESSURE_PLATE);
				// Web Block
				blocks.add(Blocks.WEB);
				// Set for Spade Blocks
				blocks.addAll(Sets.newHashSet(new Block[] {Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH}));
			}
			return blocks;
		}

		/**
		* This check if the block can be mined by the custom axe
		* @param ItemStack stack
		* @param IBlockState state
		* @return
		*/
		private boolean checkStrVsBlock(ItemStack stack, IBlockState state) {
			
			boolean b = false;
			
			// Check Block List that the axe can mine...
			Iterator<Block> it = blocks.iterator();
			
			while(it.hasNext()) {
				Block block = it.next();
				
				if(block == state.getBlock()) {
					b = true;
					break;
				}
			}
			
			
			// Check Materials
			Material material = state.getMaterial();
			
			// Added in harvest tool and harvest level
			return b ||
				   material == Material.WOOD ||
				   material == Material.PLANTS ||
				   material == Material.VINE ||
				   (((state.getBlock().getHarvestTool(state) != null && state.getBlock().getHarvestTool(state).equals("axe"))? true : false) && state.getBlock().getHarvestLevel(state) <= this.material.getHarvestLevel());
		}
		
		
		@Override
		public float getStrVsBlock(ItemStack stack, IBlockState state) {
			return (!checkStrVsBlock(stack, state))? super.getStrVsBlock(stack, state) : this.material.getEfficiencyOnProperMaterial();
		}
		public float getAttackDamage() {
			return attackDamage;
		}
}
