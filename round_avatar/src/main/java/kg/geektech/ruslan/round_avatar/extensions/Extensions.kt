package kg.geektech.ruslan.round_avatar.extensions

import android.content.Context

/**
 * This method converts dp unit to equivalent pixels, depending on device density.
 *
 * @param dp      A value in dp (density independent pixels) unit. Which we need to convert into pixels
 * @return A float value to represent px equivalent to dp depending on device density
 */
fun Context.convertDpToPx(dp: Int): Float {
    return dp.toFloat() * resources.displayMetrics.density
}