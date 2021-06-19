@import 'style/weui.wxss';
@import "/utils/wxParse/wxParse.wxss";


page {
  background-color: #fbf9fe;
  height: 100%;
}
.container {
  display: flex;
  flex-direction: column;
  min-height: 100%;
  justify-content: space-between;
}
.page-header {
  display: flex;
  font-size: 32rpx;
  color: #aaa;
  margin-top: 50rpx;
  flex-direction: column;
  align-items: center;
}
.page-header-text {
  padding: 20rpx 40rpx;
}
.page-header-line {
  width: 150rpx;
  height: 1px;
  border-bottom: 1px solid #ccc; 
}

.page-body {
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
  flex-grow: 1;
  overflow-x: hidden;
}
.page-body-wrapper {
  margin-top: 100rpx;
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
}
.page-body-wrapper form {
  width: 100%;
}
.page-body-wording {
  text-align: center;
  padding: 200rpx 100rpx;
}
.page-body-info {
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: #fff;
  margin-bottom: 50rpx;
  width: 100%;
  padding: 50rpx 0 150rpx 0;
}
.page-body-title {
  margin-bottom: 100rpx;
  font-size: 32rpx;
}
.page-body-text {
  font-size: 30rpx;
  line-height: 26px;
  color: #ccc;
}
.page-body-text-small {
  font-size: 24rpx;
  color: #000;
  margin-bottom: 100rpx;
}
.page-body-form {
  width: 100%;
  background-color: #fff;
  display: flex;
  flex-direction: column;
  width: 100%;
  border: 1px solid #eee;
}
.page-body-form-item {
  display: flex;
  align-items: center;
  margin-left: 30rpx;
  border-bottom: 1px solid #eee;
  height: 88rpx;
  font-size: 34rpx;
}
.page-body-form-key {
  width: 180rpx;
  color: #000;
}
.page-body-form-value {
  flex-grow: 1;
}
.page-body-form-value .input-placeholder {
  color: #b2b2b2;
}

.page-body-form-picker {
  display: flex;
  justify-content: space-between;
  height: 100rpx;
  align-items: center;
  font-size: 36rpx;
  margin-left: 20rpx;
  padding-right: 20rpx;
  border-bottom: 1px solid #eee;
}
.page-body-form-picker-value {
  color: #ccc;
}

.page-body-buttons {
  width: 100%;
}
.page-body-button {
  margin: 25rpx;
}
.page-body-button image {
  width: 150rpx;
  height: 150rpx;
}
.page-footer {
  text-align: center;
  color: #1aad19;
  font-size: 24rpx;
  margin: 20rpx 0;
}

.green{
    color: #09BB07;
}
.red{
    color: #F76260;
}
.blue{
    color: #10AEFF;
}
.yellow{
    color: #FFBE00;
}
.gray{
    color: #C9C9C9;
}

.strong{
    font-weight: bold;
}

.bc_green{
    background-color: #09BB07;
}
.bc_red{
    background-color: #F76260;
}
.bc_blue{
    background-color: #10AEFF;
}
.bc_yellow{
    background-color: #FFBE00;
}
.bc_gray{
    background-color: #C9C9C9;
}

.tc{
    text-align: center;
}

.page input{
    padding: 20rpx 30rpx;
    background-color: #fff;
}
checkbox, radio{
    margin-right: 10rpx;
}

.btn-area{
    padding: 10px 30px;
}
.btn-area button{
    margin-top: 20rpx;
    margin-bottom: 20rpx;
}

.page {
    min-height: 100%;
    flex: 1;
    background-color: #FBF9FE;
    font-size: 32rpx;
    font-family: -apple-system-font,Helvetica Neue,Helvetica,sans-serif;
    overflow: hidden;
}
.page__hd{
    padding: 50rpx 50rpx 100rpx 50rpx;
    text-align: center;
}
.page__title{
    display: inline-block;
    padding: 20rpx 40rpx;
    font-size: 32rpx;
    color: #AAAAAA;
    border-bottom: 1px solid #CCCCCC;
}
.page__desc{
    display: none;
    margin-top: 20rpx;
    font-size: 26rpx;
    color: #BBBBBB;
}

page{
    background-color: #F8F8F8;
    font-size: 16px;
    font-family: -apple-system-font,Helvetica Neue,Helvetica,sans-serif;
}
.page__hd {
    padding: 40px;
}
.page__bd {
    padding-bottom: 40px;
}
.page__bd_spacing {
    padding-left: 15px;
    padding-right: 15px;
}

.page__ft{
    padding-bottom: 10px;
    text-align: center;
}

.page__title {
    text-align: left;
    font-size: 20px;
    font-weight: 400;
}

.page__desc {
    margin-top: 5px;
    color: #888888;
    text-align: left;
    font-size: 14px;
}
.swiper {
    width: 100%;
    height: 400rpx;
}
.slide-image {
    width: 100%;
}
.news {
    padding: 26rpx 40rpx 26rpx 40rpx;
}
.news-title {
    color: #AAAAAA;
}
.news-item {
    margin: 10rpx 0 10rpx 0;
    
    background-color: #fff;
}
.news-item-pic {
    padding: 20rpx 0 10rpx 20rpx;
    width: 160rpx;
    
    float: left;
}
.news-item-image {
    width: 100%;
}
.news-item-words {
    width: 450rpx;
    height: 65px;
    float: right;
    overflow-y: hidden;
    padding: 20rpx 10rpx;
}
.news-item-title {
    font-size: 11pt;
    word-break: keep-all;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
}
.news-item-content {
    font-size: 8pt;
    line-height: 13pt;
    text-overflow:ellipsis; 
    color: #a9a9a9;
}
.news-more {
    color: #AAAAAA;
    font-size: 14px;
    
}
.news-more-line {
    padding-left: -26rpx important;
}
.news-details-content {
    padding: 0 40rpx 100rpx 40rpx;
}
.video {
    
}
.video-input {
    border: 1px solid #CCCCCC;   
}
.contact {
    padding: 40rpx 40rpx 40rpx 40rpx;
}
image {
    height: auto;
}