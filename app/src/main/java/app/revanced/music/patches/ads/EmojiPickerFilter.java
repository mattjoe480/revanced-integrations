package app.revanced.music.patches.ads;

import android.os.Build;

import androidx.annotation.RequiresApi;

import app.revanced.music.settings.SettingsEnum;


public final class EmojiPickerFilter extends Filter {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public EmojiPickerFilter() {
        this.pathFilterGroupList.addAll(
                new StringFilterGroup(
                        SettingsEnum.HIDE_EMOJI_PICKER,
                        "|CellType|ContainerType|ContainerType|ContainerType|ContainerType|ContainerType|"
                )
        );
    }
}
