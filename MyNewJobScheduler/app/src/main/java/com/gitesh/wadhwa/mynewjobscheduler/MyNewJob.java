package com.gitesh.wadhwa.mynewjobscheduler;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyNewJob extends JobService {
    public MyNewJob() {
    }

    @Override
    public boolean onStartJob(JobParameters jobParameters) {
       Log.i("Job"," Started");
        Toast.makeText(this,"Job Started",Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Log.i("Job"," Stopped");
        Toast.makeText(this,"Job Stopped",Toast.LENGTH_SHORT).show();
        return false;
    }


}
