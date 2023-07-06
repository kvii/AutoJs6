package org.autojs.autojs.core.ui.attribute

import android.view.View
import android.widget.AbsSeekBar
import org.autojs.autojs.core.ui.inflater.ResourceParser
import org.autojs.autojs.util.ColorUtils

open class AbsSeekBarAttributes(resourceParser: ResourceParser, view: View) : ProgressBarAttributes(resourceParser, view) {

    override val view = super.view as AbsSeekBar

    override fun onRegisterAttrs() {
        super.onRegisterAttrs()

        registerAttr("keyProgressIncrement") { view.keyProgressIncrement = it.toInt() }
        registerAttr("splitTrack") { view.splitTrack = it.toBoolean() }
        registerAttr("thumb") { view.thumb = drawables.parse(view, it) }
        registerAttr("thumbOffset") { view.thumbOffset = it.toInt() }
        registerAttr("thumbTintList") { view.thumbTintList = ColorUtils.toColorStateList(view, it) }
        registerAttr("thumbTintList") { view.thumbTintList = ColorUtils.toColorStateList(view, it) }
        registerAttr("tickMark") { view.tickMark = drawables.parse(view, it) }
        registerAttr("tickMarkTintList") { view.tickMarkTintList = ColorUtils.toColorStateList(view, it) }
    }
}
