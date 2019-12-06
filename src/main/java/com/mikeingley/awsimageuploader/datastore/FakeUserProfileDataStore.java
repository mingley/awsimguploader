package com.mikeingley.awsimageuploader.datastore;

import com.mikeingley.awsimageuploader.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


//in memory DB for testing
@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("0313bde1-1cf0-445c-bc53-8fd533b3ad96"), "random1", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("a6caabef-5031-448b-9000-0a645513e9c8"), "random2", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
