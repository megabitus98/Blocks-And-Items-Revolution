package com.megabitus.bir.proxy;

import com.megabitus.bir.item.ItemsManager;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		ItemsManager.registerRenders();
	}
}
