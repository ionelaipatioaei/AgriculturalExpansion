package com.agriculturalexpansion.handler;

import java.util.Random;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDrops {
	
    public static Random r = new Random();
    public static int chance = 0;
    
    public static int dropChance(int type) {
    	switch(type) {
    	//10% chance to drop the item
    	case 0:
    		if(r.nextInt(10) == 0) {
    			chance++;
    		} else {
    			chance = 0;
    		}
    		break;
    	//5% chance to drop the item
    	case 1:
    		if(r.nextInt(20) == 0) {
    			chance++;
    		} else {
    			chance = 0;
    		}
    		break;
    	//3% chance to drop the item
    	case 2:
    		if(r.nextInt(30) == 0) {
    			chance++;
    		} else {
    			chance = 0;
    		}
    		break;
    	default:
    		chance = 0;
    	}
    	return chance;
    }
	
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event) {
    	//Hostile Mobs
        if (event.getEntity() instanceof EntityZombie) {
 
            ItemStack stack = new ItemStack(AEItems.zombie_chunk, dropChance(0));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityCreeper) {
        	
        	ItemStack stack = new ItemStack(AEItems.creeper_chunk, dropChance(1));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySkeleton) {
        	
        	ItemStack stack = new ItemStack(AEItems.skeleton_chunk, dropChance(0));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySlime) {
        	
        	ItemStack stack = new ItemStack(AEItems.slime_chunk, dropChance(1));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySpider) {
        	
        	ItemStack stack = new ItemStack(AEItems.spider_chunk, dropChance(0));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityGuardian) {
        	
        	ItemStack stack = new ItemStack(AEItems.guardian_chunk, dropChance(1));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityGhast) {
        	
        	ItemStack stack = new ItemStack(AEItems.ghast_chunk, dropChance(1));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityWither) {
        	
        	ItemStack stack = new ItemStack(AEItems.wither_chunk, dropChance(0));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityBlaze) {
        	
        	ItemStack stack = new ItemStack(AEItems.blaze_chunk, dropChance(1));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityEnderman) {
        	
        	ItemStack stack = new ItemStack(AEItems.enderman_chunk, dropChance(1));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        //Passive Mobs
        if(event.getEntity() instanceof EntitySquid) {
        	
        	ItemStack stack = new ItemStack(AEItems.squid_chunk, dropChance(0));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityCow) {
        	
        	ItemStack stack = new ItemStack(AEItems.cow_chunk, dropChance(0));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySheep) {
        	
        	ItemStack stack = new ItemStack(AEItems.sheep_chunk, dropChance(0));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }

        if(event.getEntity() instanceof EntityChicken) {
	
        	ItemStack stack = new ItemStack(AEItems.chicken_chunk, dropChance(0));
        	EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

        	event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityPig) {
        	
        	ItemStack stack = new ItemStack(AEItems.pig_chunk, dropChance(0));
        	EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

        	event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityRabbit) {
        	
        	ItemStack stack = new ItemStack(AEItems.rabbit_chunk, dropChance(1));
        	EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

        	event.getDrops().add(drop);
        }
    }

}
