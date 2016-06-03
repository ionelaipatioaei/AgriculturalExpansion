package com.agriculturalexpansion.handler;

import java.util.Random;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.entity.EntityLivingBase;
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
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDrops {
	
	public static double rand;
    public Random r = new Random();
	
    @SubscribeEvent
    public void onMobDrops(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityZombie) {
 
            ItemStack stack = new ItemStack(AEItems.zombie_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityCreeper) {
        	
        	ItemStack stack = new ItemStack(AEItems.creeper_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySkeleton) {
        	
        	ItemStack stack = new ItemStack(AEItems.skeleton_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySlime) {
        	
        	ItemStack stack = new ItemStack(AEItems.slime_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySpider) {
        	
        	ItemStack stack = new ItemStack(AEItems.spider_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityGuardian) {
        	
        	ItemStack stack = new ItemStack(AEItems.guardian_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityGhast) {
        	
        	ItemStack stack = new ItemStack(AEItems.ghast_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySkeleton) {
        	if (((EntitySkeleton)event.getEntityLiving()).getSkeletonType() == 1) {
        	
        	ItemStack stack = new ItemStack(AEItems.wither_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        }
        
        if(event.getEntity() instanceof EntityBlaze) {
        	
        	ItemStack stack = new ItemStack(AEItems.blaze_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityEnderman) {
        	
        	ItemStack stack = new ItemStack(AEItems.enderman_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySquid) {
        	
        	ItemStack stack = new ItemStack(AEItems.squid_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        //Passive Mobs
        if(event.getEntity() instanceof EntityCow) {
        	
        	ItemStack stack = new ItemStack(AEItems.cow_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntitySheep) {
        	
        	ItemStack stack = new ItemStack(AEItems.sheep_chunk, r.nextInt(2));
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }

        if(event.getEntity() instanceof EntityChicken) {
	
        	ItemStack stack = new ItemStack(AEItems.chicken_chunk, r.nextInt(2));
        	EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

        	event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityPig) {
        	
        	ItemStack stack = new ItemStack(AEItems.pig_chunk, r.nextInt(2));
        	EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

        	event.getDrops().add(drop);
        }
        
        if(event.getEntity() instanceof EntityRabbit) {
        	
        	ItemStack stack = new ItemStack(AEItems.rabbit_chunk, r.nextInt(2));
        	EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);

        	event.getDrops().add(drop);
        }
    }

}
