package com.github.alphacode.alphacore.main;
import java.util.Map;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.Name;



/**
 * @author AlphaCode
 */
public class AlphaCoreMainLoader {

    @Name("AlphaCore")
    public static class AlphaCore implements IFMLLoadingPlugin {

        @Override
        public String[] getASMTransformerClass() {
            return new String[]{"com.github.alphacode.alphacore.maim.ClassTransformer"};
        }

        @Override
        public String getModContainerClass() {
            return null;
        }

        @Override
        public String getSetupClass() {
            return null;
        }

        @Override
        public void injectData(Map<String, Object> data) {
        }

        @Override
        public String getAccessTransformerClass() {
            return null;
        }

    }



}
