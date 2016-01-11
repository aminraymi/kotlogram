package com.github.badoualy.telegram.mtproto.tl.auth

class DhGenFailure @JvmOverloads constructor(nonce: ByteArray = ByteArray(0), serverNonce: ByteArray = ByteArray(0),
                                             newNonceHash: ByteArray = ByteArray(0)) : DhGenResult(nonce, serverNonce, newNonceHash) {

    override fun getClassId(): Int {
        return CLASS_ID
    }

    override fun toString(): String {
        return "dh_gen_fail#a69dae02"
    }

    companion object {
        @JvmStatic @JvmField
        val CLASS_ID = -1499615742
    }
}