package app.revanced.music.patches.ads;


import android.os.Build;

import androidx.annotation.RequiresApi;

import app.revanced.music.settings.SettingsEnum;


public final class PlaylistCardFilter extends Filter {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public PlaylistCardFilter() {
        this.pathFilterGroupList.addAll(
                new StringFilterGroup(
                        SettingsEnum.HIDE_PLAYLIST_CARD,
                        "music_container_card_shelf"
                )
        );
    }
}
