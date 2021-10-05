/*
 * Copyright 2019-2021 Mamoe Technologies and contributors.
 *
 *  此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 *  Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 *  https://github.com/mamoe/mirai/blob/master/LICENSE
 */
@file:Suppress("unused", "SpellCheckingInspection")

package net.mamoe.mirai.internal.network.protocol.data.proto

import kotlinx.serialization.Serializable
import kotlinx.serialization.protobuf.ProtoNumber
import net.mamoe.mirai.internal.utils.io.ProtoBuf
import net.mamoe.mirai.utils.EMPTY_BYTE_ARRAY

@Serializable
internal class NotOnlineImageExtPb : ProtoBuf {
    @Serializable
    internal class ResvAttr(
        @ProtoNumber(1) override val imageBizType: Int = 0,
        @JvmField @ProtoNumber(2) val customfaceType: Int = 0,
        @JvmField @ProtoNumber(3) val emojiPackageid: Int = 0,
        @JvmField @ProtoNumber(4) val emojiId: Int = 0,
        @JvmField @ProtoNumber(5) val text: String = "",
        @JvmField @ProtoNumber(6) val doutuSuppliers: String = "",
        @ProtoNumber(8) override val textSummary: ByteArray = EMPTY_BYTE_ARRAY,
        @JvmField @ProtoNumber(10) val emojiFrom: Int = 0,
        @JvmField @ProtoNumber(11) val emojiSource: String = "",
        @JvmField @ProtoNumber(12) val emojiWebUrl: String = "",
        @JvmField @ProtoNumber(13) val emojiIconUrl: String = "",
        @JvmField @ProtoNumber(14) val emojiMarketFaceName: String = "",
        @JvmField @ProtoNumber(15) val source: Int = 0
    ) : ProtoBuf, ImgExtPbResvAttrCommon
}
        