package gac.freecycle;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.RemoteViews;
import android.widget.Toast;

/**
 * Created by demouser on 8/16/13.
 */
public class QuickPostAppWidgetProvider extends AppWidgetProvider {

        public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
            final int N = appWidgetIds.length;

            // Perform this loop procedure for each App Widget that belongs to this provider
            for (int i=0; i<N; i++) {
                int appWidgetId = appWidgetIds[i];

                // Create an Intent to launch ExampleActivity
                Intent intent = new Intent(context, PostActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

                // Get the layout for the App Widget and attach an on-click listener
                // to the button
                RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_quickadd);
                views.setOnClickPendingIntent(R.id.widget_image, pendingIntent);
                views.setOnClickPendingIntent(R.id.widget_icon, pendingIntent);

                // Tell the AppWidgetManager to perform an update on the current app widget
                appWidgetManager.updateAppWidget(appWidgetId, views);
            }
        }
    }
