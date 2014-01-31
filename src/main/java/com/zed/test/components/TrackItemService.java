package com.zed.test.components;

public class TrackItemService {
	
	
	public void processTrackItem(TrackItem item) {
		
		System.out.println("Transformed json to object here is owner: " + item.getOwner());
	}

}
