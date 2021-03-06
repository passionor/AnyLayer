package per.goweii.anylayer.ktx

import android.graphics.drawable.Drawable
import android.view.View
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import per.goweii.anylayer.notification.NotificationLayer


fun <T : NotificationLayer> T.setContentView(contentView: View) = this.apply {
    this.contentView(contentView)
}

fun <T : NotificationLayer> T.setContentView(@LayoutRes contentViewId: Int) = this.apply {
    this.contentView(contentViewId)
}

fun <T : NotificationLayer> T.setMaxWidth(maxWidth: Int) = this.apply {
    this.maxWidth(maxWidth)
}

fun <T : NotificationLayer> T.setMaxHeight(maxHeight: Int) = this.apply {
    this.maxHeight(maxHeight)
}

fun <T : NotificationLayer> T.setIcon(@DrawableRes icon: Int) = this.apply {
    this.icon(icon)
}

fun <T : NotificationLayer> T.setIcon(icon: Drawable) = this.apply {
    this.icon(icon)
}

fun <T : NotificationLayer> T.setLabel(label: CharSequence) = this.apply {
    this.label(label)
}

fun <T : NotificationLayer> T.setLabel(@StringRes label: Int) = this.apply {
    this.label(label)
}

fun <T : NotificationLayer> T.setTime(time: CharSequence) = this.apply {
    this.time(time)
}

fun <T : NotificationLayer> T.setTitle(title: CharSequence) = this.apply {
    this.title(title)
}

fun <T : NotificationLayer> T.setTitle(@StringRes title: Int) = this.apply {
    this.title(title)
}

fun <T : NotificationLayer> T.setDesc(desc: CharSequence) = this.apply {
    this.desc(desc)
}

fun <T : NotificationLayer> T.setDesc(@StringRes desc: Int) = this.apply {
    this.desc(desc)
}

fun <T : NotificationLayer> T.setDuration(duration: Long) = this.apply {
    this.duration(duration)
}

fun <T : NotificationLayer> T.doOnNotificationClick(onNotificationClick: T.(view: View) -> Unit) = this.apply {
    this.onNotificationClick { _, view -> this.onNotificationClick(view) }
}

fun <T : NotificationLayer> T.doOnNotificationLongClick(onNotificationClick: T.(view: View) -> Boolean) = this.apply {
    this.onNotificationLongClick { _, view -> this.onNotificationClick(view) }
}

fun <T : NotificationLayer> T.setAutoDismiss(autoDismiss: Boolean) = this.apply {
    this.autoDismiss(autoDismiss)
}