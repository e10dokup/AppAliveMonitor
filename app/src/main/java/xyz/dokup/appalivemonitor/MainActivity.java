package xyz.dokup.appalivemonitor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_monitoring)
    Button mMonitoringButton;

    @BindString(R.string.btn_disable)
    String mDisableLabel;
    @BindString(R.string.btn_enable)
    String mEnableLabel;

    private boolean isEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    private void setButtonText() {
        mMonitoringButton.setText(isEnabled ? mDisableLabel : mEnableLabel);
    }

    @OnClick(R.id.btn_monitoring)
    public void onClickMonitoringButton() {
        if(isEnabled) {
            // サービスの終了処理
            isEnabled = false;
        } else {
            // サービスの開始処理
            isEnabled = true;
        }

        setButtonText();
    }
}
