package app.revanced.patches.youtube.layout.hide.shorts.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint

object SetPivotBarVisibilityParentFingerprint : MethodFingerprint(
    parameters = listOf("Z"),
    strings = listOf("FEnotifications_inbox")
)