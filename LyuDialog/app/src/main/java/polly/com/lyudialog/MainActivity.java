package polly.com.lyudialog;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.polly.ldialog.ActionSheetDialog;
import com.polly.ldialog.MyAlertDialog;
import com.polly.ldialog.SVProgressHUD;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initDialog();
        initSheetDialog();

    }

    private void initSheetDialog() {
        ActionSheetDialog myAction = new ActionSheetDialog(this);
        myAction.builder();
        myAction.setTitle("Polly");
        myAction.setCanceledOnTouchOutside(false);
        myAction.setCancelable(true);
        myAction.addSheetItem("First", ActionSheetDialog.SheetItemColor.Blue,aClick);
        myAction.addSheetItem("First", ActionSheetDialog.SheetItemColor.Blue,aClick);
        myAction.addSheetItem("First", ActionSheetDialog.SheetItemColor.Blue,aClick);
        myAction.addSheetItem("First", ActionSheetDialog.SheetItemColor.Blue,aClick);
        myAction.show();
    }

    private void initDialog() {

        MyAlertDialog myAlertDialog = new MyAlertDialog(this);
        myAlertDialog.builder();
        myAlertDialog.setTitle("Polly");
        myAlertDialog.setMsg("PhoenixPhoenixPhoenixPhoenixPhoenixPhoenixPhoenixPhoenixPhoenixPhoenix");
        myAlertDialog.setCancelable(true);
        myAlertDialog.setNegativeButton("cancel",nClock);
        myAlertDialog.setPositiveButton("true",pClock);
        myAlertDialog.show();
    }


    private ActionSheetDialog.OnSheetItemClickListener aClick = new ActionSheetDialog.OnSheetItemClickListener() {
        @Override
        public void onClick(int which) {
            SVProgressHUD.showInfoWithStatus(MainActivity.this,"cancel", SVProgressHUD.SVProgressHUDMaskType.Black, SVProgressHUD.SVProgressHUDShowTime.OneSecond);
        }
    };

    private View.OnClickListener nClock = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SVProgressHUD.showInfoWithStatus(MainActivity.this,"cancel", SVProgressHUD.SVProgressHUDMaskType.Black, SVProgressHUD.SVProgressHUDShowTime.OneSecond);
        }
    };
    private View.OnClickListener pClock = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            SVProgressHUD.showInfoWithStatus(MainActivity.this,"true", SVProgressHUD.SVProgressHUDMaskType.Black, SVProgressHUD.SVProgressHUDShowTime.OneSecond);
        }
    };
}
