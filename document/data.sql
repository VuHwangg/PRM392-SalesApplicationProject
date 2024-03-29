USE [PRM392_DB]
GO
SET IDENTITY_INSERT [dbo].[tbl_customer] ON 

INSERT [dbo].[tbl_customer] ([id], [address], [name], [password], [phone], [username]) VALUES (1, N'Ha Noi', N'Vu Hot boi', N'12345', N'012345678', N'vu')
INSERT [dbo].[tbl_customer] ([id], [address], [name], [password], [phone], [username]) VALUES (2, N'HaNoi', N'NVA', N'12345', N'012345678', N'nva')
SET IDENTITY_INSERT [dbo].[tbl_customer] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_product] ON 

INSERT [dbo].[tbl_product] ([id], [category], [color], [description], [discount], [image], [name], [price], [supplier]) VALUES (6, 1, N'Pink', N'', 10, N'https://images.unsplash.com/photo-1506777775294-c79f090bac1e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8aXBob25lJTIwNnxlbnwwfHwwfHx8MA%3D%3D', N'IPhone 6', 4950000, N'Apple Inc')
INSERT [dbo].[tbl_product] ([id], [category], [color], [description], [discount], [image], [name], [price], [supplier]) VALUES (7, 1, N'Pink', N'', 10, N'https://images.unsplash.com/photo-1592950630581-03cb41342cc5?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8aXBob25lJTIwN3xlbnwwfHwwfHx8MA%3D%3D', N'IPhone 7', 4950000, N'Apple Inc')
INSERT [dbo].[tbl_product] ([id], [category], [color], [description], [discount], [image], [name], [price], [supplier]) VALUES (8, 1, N'Pink', N'', 10, N'https://images.unsplash.com/photo-1560944959-0dbbee124a21?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8aXBob25lJTIwOHxlbnwwfHwwfHx8MA%3D%3D', N'IPhone 8', 6750000, N'Apple Inc')
INSERT [dbo].[tbl_product] ([id], [category], [color], [description], [discount], [image], [name], [price], [supplier]) VALUES (9, 1, N'Pink', N'', 10, N'https://plus.unsplash.com/premium_photo-1681336999500-e4f96fe367f8?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8aXBob25lJTIwMTB8ZW58MHx8MHx8fDA%3D', N'IPhone 10', 4950000, N'Apple Inc')
INSERT [dbo].[tbl_product] ([id], [category], [color], [description], [discount], [image], [name], [price], [supplier]) VALUES (10, 1, N'Pink', N'', 10, N'https://images.unsplash.com/photo-1591337676887-a217a6970a8a?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aXBob25lJTIwMTF8ZW58MHx8MHx8fDA%3D', N'IPhone 11', 4950000, N'Apple Inc')
INSERT [dbo].[tbl_product] ([id], [category], [color], [description], [discount], [image], [name], [price], [supplier]) VALUES (11, 1, N'Pink', N'', 10, N'https://images.unsplash.com/photo-1607936854279-55e8a4c64888?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aXBob25lJTIwMTJ8ZW58MHx8MHx8fDA%3D', N'IPhone 12', 4950000, N'Apple Inc')
INSERT [dbo].[tbl_product] ([id], [category], [color], [description], [discount], [image], [name], [price], [supplier]) VALUES (12, 1, N'Pink', N'', 5, N'https://images.unsplash.com/photo-1621939703744-9b75e3f7ff0e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8aXBob25lJTIwMTJ8ZW58MHx8MHx8fDA%3D', N'Samsung Galaxy S23 Ultra', 25950000, N'Samsung')
INSERT [dbo].[tbl_product] ([id], [category], [color], [description], [discount], [image], [name], [price], [supplier]) VALUES (13, 1, N'Pink', N'', 10, N'https://mobileworld.com.vn/uploads/news/07_2022/google_io_2022_familyshot_Pixel-7-series-pixel-watch-pixel-tablet-pixel-buds-pro.jpg', N'Google Pixel 6', 5600000, N'Google')
SET IDENTITY_INSERT [dbo].[tbl_product] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_cart] ON 

INSERT [dbo].[tbl_cart] ([id], [quantity], [customer_id], [product_id]) VALUES (37, 5, 1, 6)
SET IDENTITY_INSERT [dbo].[tbl_cart] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_order] ON 

INSERT [dbo].[tbl_order] ([id], [address], [date], [phone], [status], [total], [customer_id]) VALUES (1, N'Ha Noi', CAST(N'2023-11-08' AS Date), N'012345678', 4, 4900000, 1)
INSERT [dbo].[tbl_order] ([id], [address], [date], [phone], [status], [total], [customer_id]) VALUES (2, N'Ha Noi', CAST(N'2023-11-09' AS Date), N'012345678', 1, 0, 1)
SET IDENTITY_INSERT [dbo].[tbl_order] OFF
GO
SET IDENTITY_INSERT [dbo].[tbl_order_detail] ON 

INSERT [dbo].[tbl_order_detail] ([id], [price], [quantity], [order_id], [product_id]) VALUES (2, 4950000, 1, 1, 6)
INSERT [dbo].[tbl_order_detail] ([id], [price], [quantity], [order_id], [product_id]) VALUES (3, 9800000, 2, 1, 7)
SET IDENTITY_INSERT [dbo].[tbl_order_detail] OFF
GO
