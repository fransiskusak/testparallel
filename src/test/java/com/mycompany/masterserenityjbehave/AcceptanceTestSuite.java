package com.mycompany.masterserenityjbehave;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite extends SerenityStories {
    @Override
    public List<String> storyPaths() {
        List<String> storyPaths = new ArrayList<>();

//dirun duluan lalu abis itu ganti nama akun dan passwordnya
//        storyPaths.add("stories/Account/Positive/MengeditProfileValid.story");
//        storyPaths.add("stories/Account/Negative/MengeditProfileInvalid.story");
//        storyPaths.add("stories/Account/Positive/MengeditPasswordValid.story");

        storyPaths.add("stories/Course/Positive/MengaksesTugas.story");

//        storyPaths.add("stories/Account/Positive/Login.story");
//        storyPaths.add("stories/Account/Positive/Logout.story");
//        storyPaths.add("stories/Account/Negative/LoginInvalid.story");
//        storyPaths.add("stories/Account/Positive/MelihatProfilValid.story");
//        storyPaths.add("stories/Course/Positive/MencariCourseValid.story");
//        storyPaths.add("stories/Course/Positive/MengenrollTanpaEnrollmentKeyValid.story");
//        storyPaths.add( "stories/Course/Positive/MelihatSemuaMatakuliahValid.story" );
//        storyPaths.add("stories/Course/Positive/MengenrollDenganEnrollmentKeyValid.story");
//        storyPaths.add("stories/Course/Positive/MelihatSemuaMatakuliahYangDiambil.story");
//        storyPaths.add("stories/Course/Positive/MelakukanUnenrollValid.story");
//        storyPaths.add("stories/Course/Negative/MengenrollDenganEnrollmentKeyInvalid.story");
//        storyPaths.add("stories/Account/Positive/MendaftarAkunElokValid.story");
//        storyPaths.add("stories/Account/Negative/MendaftarAkunElokInvalid.story");


//        storyPaths.add( "stories/Course/MelihatGradeValid.story" );
//        storyPaths.add( "stories/Account/LihatMessage.story" );
        return storyPaths;
    }
}
