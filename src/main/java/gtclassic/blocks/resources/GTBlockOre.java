package gtclassic.blocks.resources;

import gtclassic.GTClassic;
import gtclassic.blocks.resources.GTBlockOre.GTBlockOreVariants;
import gtclassic.util.GTBlocks;
import gtclassic.util.GTItems;
import ic2.api.item.IC2Items;
import ic2.core.platform.registry.Ic2Items;
import ic2.core.platform.textures.Ic2Icons;
import ic2.core.platform.textures.obj.ITexturedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GTBlockOre extends Block implements ITexturedBlock {
    public enum GTBlockOreVariants{
       
        IRIDIUM(97, 3, 20.0F),
        RUBY(98, 2, 4.0F),
        SAPPHIRE(99, 2, 4.0F),
        BAUXITE(100, 1, 3.0F);
        
    	private int id;
    	private int harvest;
    	private float hardness;

        GTBlockOreVariants(int id, int harvest, float hardness){
            this.id = id;
            this.harvest = harvest;
            this.hardness = hardness;
        }

        public int getID(){
            return id;
        }
        public int getHarvest(){return harvest;}
        public float getHardness() { return hardness; }
    }
    
    
    GTBlockOreVariants variant;
    public GTBlockOre(GTBlockOreVariants variant) {
        super(Material.ROCK);
        this.variant = variant;
        setRegistryName(variant.toString().toLowerCase() + "_ore");
        setUnlocalizedName(GTClassic.MODID + "." + variant.toString().toLowerCase() + "_ore");
        setCreativeTab(GTClassic.creativeTabGT);
        setHardness(variant.getHardness());
        setResistance(10.0F);
        setHarvestLevel("pickaxe", variant.getHarvest());
        setSoundType(SoundType.STONE);
    }

    public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune){
        ArrayList<ItemStack> drops = new ArrayList<>();
        
       //add silver
        
        if (this == GTBlocks.iridiumOre) {
        drops.add(Ic2Items.iridiumOre);
        }
        
        if (this == GTBlocks.rubyOre) {
        		drops.add(new ItemStack(GTItems.ruby, 1));
        		}
        
        
        if (this == GTBlocks.sapphireOre) {
        		drops.add(new ItemStack(GTItems.sapphire, 1));
        		}
        	
        
        if (this == GTBlocks.bauxiteOre) {
            drops.add(new ItemStack(GTBlocks.bauxiteOre, 1));
            }
        
        return drops;
    }
    
    
    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune){
    	Random rand = world instanceof World ? ((World)world).rand : new Random();    
    	int xp = 0;
    	
    		if (this == GTBlocks.iridiumOre){
            	xp = MathHelper.getInt(rand, 3, 7);
            }
    		else if (this == GTBlocks.rubyOre){
    			xp = MathHelper.getInt(rand, 2, 5);
            }
    		else if (this == GTBlocks.sapphireOre){
    			xp = MathHelper.getInt(rand, 2, 5);
            }
            return xp;
    }
  
    @Override
    public AxisAlignedBB getRenderBoundingBox(IBlockState iBlockState) {
        return FULL_BLOCK_AABB;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public TextureAtlasSprite getTextureFromState(IBlockState iBlockState, EnumFacing enumFacing) {
        return Ic2Icons.getTextures("gtclassic_blocks")[variant.getID()];
    }

    @Override
    public TextureAtlasSprite getParticleTexture(IBlockState state) {
        return this.getTextureFromState(state, EnumFacing.SOUTH);
    }

    @Override
    public List<IBlockState> getValidStates() {
        return this.blockState.getValidStates();
    }

    @Override
    public IBlockState getStateFromStack(ItemStack stack) {
        return this.getStateFromMeta(stack.getMetadata());
    }
}
