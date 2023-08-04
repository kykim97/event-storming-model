
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DashboardFileStatusManager from "./components/listers/DashboardFileStatusCards"
import DashboardFileStatusDetail from "./components/listers/DashboardFileStatusDetail"

import DriveFileManager from "./components/listers/DriveFileCards"
import DriveFileDetail from "./components/listers/DriveFileDetail"

import IndexerFileIndexManager from "./components/listers/IndexerFileIndexCards"
import IndexerFileIndexDetail from "./components/listers/IndexerFileIndexDetail"

import VideoProcessingVideoStreamManager from "./components/listers/VideoProcessingVideoStreamCards"
import VideoProcessingVideoStreamDetail from "./components/listers/VideoProcessingVideoStreamDetail"

import NotificationNotificationManager from "./components/listers/NotificationNotificationCards"
import NotificationNotificationDetail from "./components/listers/NotificationNotificationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/dashboards/fileStatuses',
                name: 'DashboardFileStatusManager',
                component: DashboardFileStatusManager
            },
            {
                path: '/dashboards/fileStatuses/:id',
                name: 'DashboardFileStatusDetail',
                component: DashboardFileStatusDetail
            },

            {
                path: '/drives/files',
                name: 'DriveFileManager',
                component: DriveFileManager
            },
            {
                path: '/drives/files/:id',
                name: 'DriveFileDetail',
                component: DriveFileDetail
            },

            {
                path: '/indexers/fileIndices',
                name: 'IndexerFileIndexManager',
                component: IndexerFileIndexManager
            },
            {
                path: '/indexers/fileIndices/:id',
                name: 'IndexerFileIndexDetail',
                component: IndexerFileIndexDetail
            },

            {
                path: '/videoProcessings/videoStreams',
                name: 'VideoProcessingVideoStreamManager',
                component: VideoProcessingVideoStreamManager
            },
            {
                path: '/videoProcessings/videoStreams/:id',
                name: 'VideoProcessingVideoStreamDetail',
                component: VideoProcessingVideoStreamDetail
            },

            {
                path: '/notifications/notifications',
                name: 'NotificationNotificationManager',
                component: NotificationNotificationManager
            },
            {
                path: '/notifications/notifications/:id',
                name: 'NotificationNotificationDetail',
                component: NotificationNotificationDetail
            },



    ]
})
