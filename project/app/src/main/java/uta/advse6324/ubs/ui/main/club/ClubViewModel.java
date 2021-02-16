package uta.advse6324.ubs.ui.main.club;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClubViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ClubViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is club fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}