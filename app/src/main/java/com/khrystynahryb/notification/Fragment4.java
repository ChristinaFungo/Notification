package com.khrystynahryb.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static androidx.core.app.NotificationCompat.PRIORITY_HIGH;

public class Fragment4 extends Fragment {

    private NotificationManager notificationManager;
    private static final int NOTIFY_ID = 4;
    private static final String CHANNEL_ID = "CHANNEL_ID";
    TextView b4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_4, container, false);

        b4 = rootView.findViewById(R.id.tv_frag4);
        notificationManager = (NotificationManager) getActivity().getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                PendingIntent pendingIntent = PendingIntent.getActivity(getActivity().getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
                NotificationCompat.Builder notificationBuilder =
                        new NotificationCompat.Builder(getActivity().getApplicationContext(), CHANNEL_ID)
                                .setAutoCancel(false)
                                .setSmallIcon(R.mipmap.ic_launcher)
                                .setWhen(System.currentTimeMillis())
                                .setContentIntent(pendingIntent)
                                .setContentTitle("You create a notification")
                                .setContentText("notification 4")
                                .setPriority(PRIORITY_HIGH);
                createChanelifNeeded(notificationManager);
                notificationManager.notify(NOTIFY_ID, notificationBuilder.build());
            }
        });
        return rootView;
    }
    public static void createChanelifNeeded (NotificationManager manager){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(notificationChannel);
        }

    }
}