package com.github.alphacode.alphacore.api.threads;
import net.minecraftforge.common.MinecraftForge;

/**
 * @author AlphaCode:JasonAlpha
 */
public class MainEventThreads extends Thread {
    @Override
    public void run() {MinecraftForge.ORE_GEN_BUS.register(this);};






}
