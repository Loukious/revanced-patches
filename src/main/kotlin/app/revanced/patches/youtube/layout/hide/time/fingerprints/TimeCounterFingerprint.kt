package app.revanced.patches.youtube.layout.hide.time.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.annotation.FuzzyPatternScanMethod
import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

@FuzzyPatternScanMethod(1)
object TimeCounterFingerprint : MethodFingerprint(
    "V", AccessFlags.PUBLIC or AccessFlags.FINAL, listOf(), listOf(
        Opcode.IGET_OBJECT,
        Opcode.IGET_WIDE,
        Opcode.CONST_WIDE_16,
        Opcode.CMP_LONG,
        Opcode.IF_LEZ,
        Opcode.IGET_OBJECT,
        Opcode.IF_EQZ,
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT,
        Opcode.IF_EQZ,
        Opcode.GOTO,
    )
)